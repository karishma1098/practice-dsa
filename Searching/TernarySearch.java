import java.util.Scanner;

public class TernarySearch {

    public int ternarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        int mid1, mid2;
        while (low<=high) {
            mid1 = low + (high-low)/3;
            mid2 = high - (high-low)/3;
            if(arr[mid1] == key) {
                return mid1;
            } else if (arr[mid2] == key) {
                return mid2;
            }
            //extreme right
            if(key>arr[mid2]) {
                low = mid2+1;
            }
            //extreme left
            else if (key<arr[mid1]) {
                high = mid1-1;
            }
            //middle
            else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        TernarySearch ternarySearch = new TernarySearch();
        int index = ternarySearch.ternarySearch(arr,key);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : " + index);
    }
}

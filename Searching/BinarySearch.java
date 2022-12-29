import java.util.Scanner;

public class BinarySearch {

    public int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        while (low<=high) {
            mid = (low + high)/2;
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid]<key)
                low = mid + 1;
            else
                high = mid - 1;
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
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.binarySearch(arr,key);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : " + index);
    }
}

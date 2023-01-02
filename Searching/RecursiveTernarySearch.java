import java.util.Scanner;

public class RecursiveTernarySearch {
    public int recursiveTernarySearch(int[] arr, int key, int low, int high) {
        while (low<=high) {
            int mid1 = low + (high-low)/3;
            int mid2 = high - (high-low)/3;
            if(arr[mid1] == key)
                return mid1;
            else if (arr[mid2] == key)
                return mid2;
            else if (key>arr[mid2])
                return recursiveTernarySearch(arr, key, mid2+1, high);
            else if (key<arr[mid1])
                return recursiveTernarySearch(arr, key, low, mid1-1);
            else
                return recursiveTernarySearch(arr, key, mid1+1, mid2-1);
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
        RecursiveTernarySearch recursiveTernarySearch = new RecursiveTernarySearch();
        int index = recursiveTernarySearch.recursiveTernarySearch(arr,key,0,arr.length-1);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : " + index);
    }
}

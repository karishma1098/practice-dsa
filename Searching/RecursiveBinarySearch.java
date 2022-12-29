import java.util.Scanner;

public class RecursiveBinarySearch {

    public int recursiveBinarySearch(int[] arr, int key, int low, int high, int mid) {
        if(low>high)
            return -1;
        if(arr[mid] == key)
            return mid;
        else if(arr[mid]<key)
            return recursiveBinarySearch(arr, key, mid+1,(low+high)/2, high);
        else
            return recursiveBinarySearch(arr, key, low,(low+high)/2, mid-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        int index = recursiveBinarySearch.recursiveBinarySearch(arr,key,0, arr.length-1,(arr.length-1)/2);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : " + index);
    }
}

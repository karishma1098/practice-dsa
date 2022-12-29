import java.util.Scanner;

public class RecursiveLinearSearch {

    public int recursiveLinearSearch(int[] arr, int key, int index) {
        if(index > arr.length)
            return -1;
        else if(arr[index] == key)
            return index;
        else
            return recursiveLinearSearch(arr, key, index+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        RecursiveLinearSearch recursiveLinearSearch = new RecursiveLinearSearch();
        int index = recursiveLinearSearch.recursiveLinearSearch(arr,key, 0);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : " + index);
    }
}

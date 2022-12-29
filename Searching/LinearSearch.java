import java.util.Scanner;

public class LinearSearch {

    public int linearSearch(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key)
                return i;
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
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.linearSearch(arr,key);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : " + index);
    }
}

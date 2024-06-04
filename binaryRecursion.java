import java.util.Scanner;

public class binarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = n - 1;
        System.out.println("ENTER THE NO WHICH U WANT TO FIND:");
        int x = sc.nextInt();
        int result = binarySearch(arr, low, high, x);
        System.out.println("At index number:" + result);
    }

    public static int binarySearch(int[] arr, int low, int high, int x) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            } else {
                return binarySearch(arr, mid + 1, high, x);
            }
        }
        return -1; // Element not found
    }
}


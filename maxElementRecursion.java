//https://youtu.be/XpUiZg9YZQg?si=Xgde1U8idkR9DF4u
package javacoding;
import java.util.*;

public class maxElementRecursion {
    public static int maximumElement(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int misa = maximumElement(arr, idx + 1);
        if (misa > arr[idx]) {
            return misa;
        } else {
            return arr[idx];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter the array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = maximumElement(arr, 0);
        System.out.println(max);
    }
}
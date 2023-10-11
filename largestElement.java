//FIND LARGEST ELEMENT IN AN ARRAY
package javacoding;
import java.util.*;
public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
    }
    System.out.println("largest element is :");
    System.out.println(largest);
}
}

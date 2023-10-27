package javacoding;

public class smallestElement{
    public static void main(String[] args) {
        int arr[] = {131,3,23,321,2};
        int n =arr.length;;
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("MINIMUM ELEMENT IS:");
        System.out.println(min);
    }
}

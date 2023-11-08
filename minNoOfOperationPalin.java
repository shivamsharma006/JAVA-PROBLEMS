//https://youtu.be/wiDLcGxhh80?feature=shared
//Find minimum number of merge operations to make an array palindrome
/*Example : 

Input : arr[] = {15, 4, 15}
Output : 0
Array is already a palindrome. So we
do not need any merge operation.

Input : arr[] = {1, 4, 5, 1}
Output : 1
We can make given array palindrome with
minimum one merging (merging 4 and 5 to
make 9) */

package javacoding;

public class minNoOfOperationPalin {
    public static int minOperations(int arr[],int n){
        int ans = 0;
        int i =0;
        int j = n-1;
        while (i<j) {
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                i++;
                arr[i] += arr[i-1];
                ans++;
            }
            else{
                j--;
                arr[j] += arr[j+1];
                ans++;
            }
    }
    return ans;
}
    public static void main(String[] args) {
        int arr[] = {11,14,15,99};
        int n =arr.length;
        int result  = minOperations(arr, n);
        System.out.println(result);
    }
}

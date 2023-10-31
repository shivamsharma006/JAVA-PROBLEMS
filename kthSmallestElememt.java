//https://youtu.be/DP2C6q9PYyQ?feature=shared
//https://youtu.be/yAs3tONaf3s?feature=shared

/*QUES--Given an array arr[] and an integer K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct.


Example 1:
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.*/
package javacoding;
import java.util.*;

class kthSmallestElement{
    public static int kthSmallest(int[] arr, int k) 
    { 

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //for max priority queue
        int n = arr.length;
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for (int i = k; i<n; i++){
            int x = pq.poll();
            if(arr[i]<x){
                pq.add(arr[i]);
            }
            else{
                pq.add(x);
            }
        }
        return pq.peek();
    } 
    public static void main(String[] args) {
        int arr[] = {54,4,5,23,44};
        int k=2;//k is the element number which u want to display
        int result = kthSmallest(arr,k);
        System.out.println(result);
    }
}

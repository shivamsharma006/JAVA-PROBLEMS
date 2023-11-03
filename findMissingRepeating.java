//https://youtu.be/2D0D8HE6uak?feature=shared
//USE FIRST APPROACH OF THIS VIDEO
package javacoding;


public class findMissingRepeating{

    public static int [] missingElement(int arr[]){
        
        long n = arr.length;
        long SN = (n*(n+1))/2;
        long S2N = (n * (n+1) * (2*n+1)) /6;
        long S =0;
        long S2 = 0;
        for(int i=0; i<n; i++){
            S += arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }
        long val1 = S-SN;//x-y
        long val2 = S2- S2N;
        val2 = val2/val1; //x+y
        long x = (val1+val2)/2; //x is repeating element
        long y = x-val1; // y is missing element
        int[] ans = {(int)x, (int)y};

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,5};
      
        int[] result = missingElement(arr);
        System.out.println(result[0] + " "  + result[1]);
    }
}

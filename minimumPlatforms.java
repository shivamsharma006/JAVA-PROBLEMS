package javacoding;
import java.util.Arrays;
public class minimumPlatforms {
  // Function to find the minimum number of platforms required at the
  // railway station such that no train waits.
  public static int findPlatform(int arr[], int dep[], int n) {
    Arrays.sort(arr);
    Arrays.sort(dep);
    int platform_needed = 1;
    int result = 1;
    int i = 1;//2nd ARRIVAL TRAIN
    int j = 0;//1st DEPARTURE TRAIN
    while (i < n && j < n) {
      if (arr[i] <= dep[j]) {
        platform_needed++;
        i++;
      } else if (arr[i] > dep[j]) {
        platform_needed--;
        j++;
      }
      if (platform_needed > result) {
        result = platform_needed;
      }
    }
    return result;
  }

  public static void main(String[] args) {
      int arr[] = {900, 940, 950, 1100, 1500, 1800};
      int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
      int n =6;
      int result=findPlatform(arr, dep, n);
      System.out.println(result);
    
  }
}

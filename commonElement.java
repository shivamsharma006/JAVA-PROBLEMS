 //PROGRAM TO FIND COMMON ELEMENTS IN THREE SORTED ARRAYS
package javacoding;

public class commonElement {
  public static void  commonElements(int arr1[], int arr2[], int arr3[]){
    int x=0, y=0, z=0;
    while(x<arr1.length && y<arr2.length && z<arr3.length){
      if(arr1[x]==arr2[y] && arr2[y]==arr3[z]){
        System.out.println(arr1[x]);
        x++;
        y++;
        z++;
      }
      else if(arr1[x]>arr2[y]){
        y++;
      }
      else if(arr2[y]>arr3[z]){
        z++;
      }
      else
      {
        x++;
      }
    }
  }
  public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5,6,7,8};
    int arr2[] = {1,3,12,42,22};
    int arr3[] = {1,3,33,423,42};
    commonElements(arr1, arr2, arr3);
  }
}

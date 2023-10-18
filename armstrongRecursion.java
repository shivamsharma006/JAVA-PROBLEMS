//https://youtu.be/HZWzfehy2t8?si=aVN6jRKupTDJzghp
package javacoding;
import java.util.*;
public class armstrongRecursion {
      public static int arm(int n){
        if(n<10)
            return n*n*n;
            return (n%10)*(n%10)*(n%10)+arm(n/10);//for example :153
                                                  //(n%10)*(n%10)*(n%10)+arm(n/10)
                                                  //(3)*(3)*(3)=27 then now the number only left 15
                                                  //again->(5)*(5)*(5)=125 now left number is 1
                                                  //ahain-> (1)*(1)*(1)=1
                                                  //add all= it gives us 153
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int r = arm(num);
        if(num == r){
            System.out.println("Yes,ITS A ARMSTRONG NUMBER.");
        }
        else{
            System.out.println("NOT A ARMSTRONG NUMBER.");
        }
    }
}
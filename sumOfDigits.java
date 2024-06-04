import java.util.*;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A DIGIT:");
        int num = sc.nextInt();
        int sum = sumOfDigit(num);
        System.out.println("SUM is:" + sum);
    }
    public static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumOfDigit(n/10);
    }
}

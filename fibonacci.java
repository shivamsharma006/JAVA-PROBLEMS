
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number to find fibonacci series:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = findFibonacci(num);
        System.out.println("RESULT IS : " + result);
    }
public static int  findFibonacci(int num){
    int result = 0;
    if(num==0 || num ==1){
        return num;
    }
    else{
        result =  findFibonacci(num-1) +  findFibonacci(num-2);
    }
    return result;
}
}

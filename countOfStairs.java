import java.util.Scanner;

public class countOfStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = findSteps(n+1); //relationship b/w count of stairs and fibonacci series
        //Understood by more PW classes 
        System.out.println("Total steps are:" + result);
    }
    public static int findSteps(int n){
        int result = 0;
        if(n<=1){
            return n;
        }
        result = findSteps(n-1) + findSteps(n-2);
        return result;
    }
}

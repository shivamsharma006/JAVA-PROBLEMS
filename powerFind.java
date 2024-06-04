import java.util.Scanner;

public class powerFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A DIGIT:");
        int x = sc.nextInt();
        System.out.println("Enter the power:");
        int pow = sc.nextInt();
        int ans = findPower(x,pow);
        System.out.println(ans);
    }
    public static int findPower(int x, int pow){
        if(pow==1){
            return x;
        }
        int result = x * findPower(x, pow-1);
        return result;
    }
}

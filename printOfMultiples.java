import java.util.Scanner;

public class printOfMultiples {
public static void main(String[] args) {
        System.out.println("Enter a number to find which multiple u want");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a number till which number u want to multiple: ");
        int k = sc.nextInt();
        findMultiple(num,k);
    }
public static void findMultiple(int num,int k){
    if(k==1){
        System.out.println("RESULT IS:" + "\n" + num);
        return;
    }
        findMultiple(num,k-1);
        System.out.println(num*k);
}
}

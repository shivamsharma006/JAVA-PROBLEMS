package javacoding;
public class sumOfDigits{
    public static int sumOfDigits(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+sumOfDigits(num/10);
    }
    public static void main(String[] args) {
        int num = 12345;
        int result = sumOfDigits(num);
        System.out.println(result);

    }
}
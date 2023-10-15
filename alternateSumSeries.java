package javacoding;

public class alternateSumSeries {
    public static int sumSeries(int num){
        //base case condition
        if(num==0){
            return 0;
        }
        //recursive function call
        else if(num%2==0){//check num is even or not
            return sumSeries(num-1)-num;
        }
        //check num is odd or not
        else
        {
            return sumSeries(num-1)+num;
        }
    }
    public static void main(String[] args) {
        int num = 10;
        int result = sumSeries(num);
        System.out.println(result);
    }
}

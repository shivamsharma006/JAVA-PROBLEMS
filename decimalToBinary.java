//QUESTION-> GIVEN A NUMBER PRINT ITS BINARY REPRESENTATION.
//PW CLASSES
package javacoding;
public class decimalToBinary{
    public static void totalSum(int num){
        StringBuilder result = new StringBuilder();
        while(num>0){
            int bit = num & 1;
            result.insert(0,bit);
            //right shift i.e. division by 2
            num>>=1;
        }
        if(result.length()==0){
            System.out.println("0");
        }
            System.out.println("BINARY REPRESENTATION :" + result);
    }
    public static void main(String[] args){
        int num=5;
        totalSum(num);
    }
}
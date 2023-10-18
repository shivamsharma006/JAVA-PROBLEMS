//https://youtu.be/sPAT_DbvDj0?si=Uw-0vkBy9NTHL-_e
package javacoding;
import  java.util.*;
import java.io.*;
public  class permutationRecursion{
    public static void main(String[] args) throws Exception{
    System.out.println("enter char which you want to permutate");
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     printPermutations(str, "");
    }
     public static void printPermutations(String ques, String asf){
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0; i<ques.length(); i++){
           char ch = ques.charAt(i);
           String qlpart = ques.substring(0, i);
           String qrpart = ques.substring(i+1);
           String roq = qlpart+qrpart;
           printPermutations(roq,asf+ch);

        }
    }
}
//PW JAVA (RECURSION PLAYLIST)
package javacoding;

public class printMultiples {
    public static void printMult(int n, int k) {
        //base case condition
        if(k==1){
            System.out.println(n);
            return;
        }
        //recursive function call
        printMult(n, k - 1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        int n = 24;
        int k = 5;// 24*5=__
                  // 24*4=__
                  // 24*3=__
                  // 24*2=__
                  // 24*1=24
        printMult(n, k);
        System.out.println();
    }
}

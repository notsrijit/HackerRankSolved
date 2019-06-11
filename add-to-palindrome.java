import java.io.*;
import java.util.*;

class anujit_palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), m=0, sum=0;
        
        if (n>=10){
            // System.out.println(n);
            // System.out.println("==============");            
            while(true){

                int n1=n;
                int l = String.valueOf(n).length();
                // System.out.println(l + " size\n");
                // System.out.println(n + " current 'n' value\n");
                for (int i=1; i<=l; i++){
                    m = (m*10) + (n1%10);
                    n1= n1/10;
                }
                // System.out.println(m + " after swap\n");
                if (m == n){
                    break;
                }
                else{
                    sum = (m+n);

                // System.out.println(sum + " sum of " + m + "+" + n +"\n");
                    n=sum;
                    m=0;
                }
                // System.out.println("==============\n");

            }
        }

        System.out.println(m);

    }
}

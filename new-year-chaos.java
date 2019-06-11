import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++)
        {
            int n = in.nextInt();
            int q[] = new int[n];
            for(int i=0; i < n; i++)
                q[i] = in.nextInt();

            int bribe = 0;
            boolean chaotic = false;
            for(int i = 0; i < n; i++)
            {
                if(q[i]-(i+1) > 2)
                {              
                    chaotic = true;
                    break;    
                }
                for (int j = Math.max(0, q[i]-2); j < i; j++)
                    if (q[j] > q[i])
                        bribe++;
            }
            if(chaotic)
                System.out.println("Too chaotic");
            else
                System.out.println(bribe);
        }
     }
  }
  
  // Or, a stupider way...
  
import java.io.*;
import java.util.*;

class hackertest8{

    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), result=0;

        for (int i=0; i<n; i++){
            int m = sc.nextInt();
            int[] arr = new int [m];
            for (int j=0; j<m; j++){
                arr[j] = sc.nextInt();
            }
            result = minimumBribes(arr);
            if (result == 0){
                System.out.println ("Too chaotic");
            }
            else{
                System.out.println (result);
            }
        }

    }

    public static int minimumBribes (int[] arr){

        int l = arr.length, sum=0;

        for (int i=0; i<l; i++){
            int c=0;
            for (int j=i+1; j<l; j++){
                if (arr[i] > j){
                    c++;
                    if (c>2){
                        return 0;
                    }
                }
                else{                    
                }
            }
            sum = sum+c;
        }
        return sum;

    }
}

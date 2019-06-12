import java.io.*;
import java.util.*;

public class Solution{

    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);
        long arr [] = new long [5];
        long max = Long.MIN_VALUE, min = Long.MAX_VALUE;

        for (int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<5; i++){
            long sum = 0;
            for (int j=0; j<5; j++){
                if(j == i){                    
                }
                else{
                    sum = sum + arr[j];
                }
            }
            if (sum > max){
                max = sum;
            }
            if (sum < min){
                min = sum;
            }
        }

        System.out.println (min + " " + max);
    }

}

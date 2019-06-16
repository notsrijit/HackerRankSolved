import java.io.*;
import java.util.*;

public class Solution{

    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long arr [][] = new long [n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextLong();
            }
        }

        long d1=0, d2=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i == j){
                    // System.out.println( "d1: " + arr[i][j]);
                    d1 = d1 + arr[i][j];
                }
                if( j == (n-i-1)){
                    // System.out.println( "d2: " + arr[i][j]);
                    d2 = d2 + arr[i][j];
                }
            }
        }

        System.out.println( Math.abs(d1-d2));

    }
}

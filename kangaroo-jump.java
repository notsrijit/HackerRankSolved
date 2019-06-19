import java.io.*;
import java.util.*;

public class Solution {

    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);
        long x1 = sc.nextLong();
        long v1 = sc.nextLong();
        long x2 = sc.nextLong();
        long v2 = sc.nextLong();

        int flag = 0;
        while (x1 < x2 && v2 < v1){
            
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2){
                flag = 1;
                break;
            }
            
        }

        if (flag == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

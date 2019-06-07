import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = sc.nextInt();
        char arr [] = new char [n];
        int c=0, count=0;
        
        for(int i=0; i<n; i++){
            if( c < s.length() ){
                arr[i] = s.charAt(c);
                c++;
                if( arr[i]== 'a'){
                    count++;
                }            
            }
            else{
                c=0;
                i--;
            }
        }

        System.out.println(count);
    }
}

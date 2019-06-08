import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] a= new int[n];
    for(int i=0;i<n;a[i]=scan.nextInt(),i++);
   	 d=d%n;
   	 System.out.println(d);
    for(int i=d;i<n;i++)
        System.out.print(a[i]+" ");
    
    for(int i=0;i<d;i++)
         System.out.print(a[i]+" ");
    }
    
  }

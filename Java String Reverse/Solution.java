import java.io.*;
import java.util.*;
import java.util.Arrays; 

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char a[] = new char[A.length()];
        char b[] = new char[A.length()];
        for(int i = 0;i<A.length();i++){
             a[i] = A.charAt(i);
            
        }
        for(int i = (A.length()-1);i>=0;i--){
             b[A.length()-(i+1)] = a[i];
             }
        if(Arrays.equals(a, b)==true)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}

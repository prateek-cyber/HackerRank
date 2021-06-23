import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class stair_case{

    // Complete the staircase function below.
    static void staircase(int n) {
       
for(int i=n;i>0;i--){
    for(int y=1;y<=n;y++){
        if(y>=i){
            System.out.print("#");
        }
        else{
    System.out.print(" ");
        }
    
    }
    System.out.println();
    
}
    }


    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

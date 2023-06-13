import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int len = n * 2;
        int sum = 1;
        for(int i = 0; i >= 0; i += sum) {
            for(int j = 0; j < len; j++) {
                if(j > i && j < len - i - 1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }

            if(i == n-1) {
                sum *= -1;
            }

            System.out.println();
        }
        //end line
    }
}  

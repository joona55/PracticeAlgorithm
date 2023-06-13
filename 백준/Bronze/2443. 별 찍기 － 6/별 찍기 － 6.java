import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int len = n * 2;

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < len; j++) {
                if(j > i && j < len - i ) {
                    System.out.print("*");
                }
                else if(j < len - i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //end line
    }
} 
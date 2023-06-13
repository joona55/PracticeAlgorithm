import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 1;

        for(int i = 1; i > 0; i += sum) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i == n) {
                sum *= -1;
            }
        }
        //end line
    }
} 
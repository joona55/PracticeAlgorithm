import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = sc.nextInt();
        Boolean check = false;

        while(l < 101) {
            int num = (n / l) - (l - 1) / 2;

            if(num < 0) {
                break;
            }

            int sum = num;

            for(int i = num + 1; i < num + l; i++) {
                sum += i;
                if(sum == n) {
                    check = true;
                    break;
                }
            }

            if(check) {
                for(int i = num; i < num + l; i++) {
                    System.out.print(i + " ");
                }
                break;
            }

            l += 1;
        }
        
        if(check == false) {
            System.out.println(-1);
        }
        //end line
        }

        
}
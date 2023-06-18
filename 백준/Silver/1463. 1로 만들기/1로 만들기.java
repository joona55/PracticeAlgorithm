import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int tmp[] = new int[n+1];

        for(int i = 2; i <= n; i++) {
            tmp[i] = tmp[i - 1] + 1;
            if(i % 2 == 0) {
                tmp[i] = Math.min(tmp[i], tmp[i / 2] + 1);
            }
            if(i % 3 == 0) {
                tmp[i] = Math.min(tmp[i], tmp[i / 3] + 1);
            }
        }

        System.out.println(tmp[n]);

        //end line
    }
}
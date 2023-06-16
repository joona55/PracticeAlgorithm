import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String str = sc.next();

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == 'S') {
                count++;
            }
            else {
                count++;
                i++;
            }
        }

        if(count < n) {
            count++;
        }
        
        System.out.println(count);
        // end line
    }
}
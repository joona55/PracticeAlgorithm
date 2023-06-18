import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String res = sc.next();

        StringBuilder sb = new StringBuilder(res);

        for(int i = 0; i < n - 1; i++) {
            String str = sc.next();

            for(int j = 0; j < str.length(); j++) {
                if(res.charAt(j) != str.charAt(j)) {
                    sb.setCharAt(j, '?');
                    res = sb.toString();
                }
            }
        }

        System.out.println(res);
        //end line
        }

        
}
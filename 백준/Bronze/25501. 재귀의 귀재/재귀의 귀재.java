import java.util.*;
import java.io.*;

public class Main {
    
    static int count = 0;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String str = sc.next();

            int res = isPalindrome(str);
            System.out.printf("%d %d%n", res, count);
            count = 0;
        }

        //end line
    }

    public static int recursion(String s, int l, int r) {
        if(l >= r) {
            count++;
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            count++;
            return 0;
        }          
        else {
            count++;
            return recursion(s, l+1, r-1);
        }
            
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length() - 1);
    }
} 
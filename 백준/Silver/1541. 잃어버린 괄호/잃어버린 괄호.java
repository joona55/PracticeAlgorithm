import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int res = Integer.MAX_VALUE;

        String str = sc.nextLine();
        StringTokenizer stMinus = new StringTokenizer(str, "-");

        while(stMinus.hasMoreTokens()) {
            int sum = 0;
            StringTokenizer stPlus = new StringTokenizer(stMinus.nextToken(), "+");

            while(stPlus.hasMoreTokens()) {
                sum += Integer.parseInt(stPlus.nextToken());
            }

            if(res == Integer.MAX_VALUE) 
                res = sum;
            else 
                res -= sum;

        }

        System.out.println(res);

        //end line
    }
}
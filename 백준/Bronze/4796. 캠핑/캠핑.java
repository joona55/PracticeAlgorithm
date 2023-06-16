import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;
        
        while(true) {
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();

            
            int res = 0;
            if(l == p && p == v && v == 0)
                break;

            while(true) {
                if(v > p) {
                    res += l;
                    v -= p;
                }
                else {
                    if(l > v) {
                        res += v;
                    }
                    else {
                        res += l;
                    }
                    break;
                }
            }

            System.out.printf("Case %d: %d%n", caseNum, res);
            caseNum++;
        }
        // end line
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int num = (a * d) + (c * b);
        int deno = b * d;

        int res = gcd(num, deno);

        System.out.println(num / res + " " + deno / res);

    }
    public static int gcd(int a, int b) {
        int c = 0;

        while(b > 0) {
            c = a % b;
            a = b;
            b = c;
        }

        return a;
        /*
         * 유클리드 호제법
         * 1. 큰수를 작은수로 나누기
         * 2. 나누는 수를 나머지로 계속 나누기
         * 3. 나머지가 0이 나올면 그 때 나누는 수가 최대공약수
         *  
         * G = 최대공약수, R = 나머지, Q = 몫
         * a = b * Q + R
         * a * G = (b * Q * G) + r
         * r = a * Q - (b * Q * G)
         *   = G *(a - (b * Q))
         * 
         * 최소공배수 = (a * b) / 최대공약수
         */
    }
} 

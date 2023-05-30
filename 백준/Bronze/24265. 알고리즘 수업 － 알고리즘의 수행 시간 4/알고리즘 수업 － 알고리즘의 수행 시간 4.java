import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long res = 0;
        for(int i = 0; i < n; i++) {
            res += i;
        }
        System.out.println(res);
        System.out.println(2);
    }
} 
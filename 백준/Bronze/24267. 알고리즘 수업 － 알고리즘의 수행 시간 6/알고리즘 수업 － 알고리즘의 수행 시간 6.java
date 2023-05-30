import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long res = n * (n - 1) * (n - 2);
        res /= 6;
        
        System.out.println(res);
        System.out.println(3);
    }
} 

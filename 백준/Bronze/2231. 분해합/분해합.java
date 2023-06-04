import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int res = 0;

        for(int i = 1; i < n; i++) {
            int sum = 0;
            int rem = i;

            while(rem != 0) {
                sum += rem % 10;
                rem /= 10;
            } 

            if(sum + i == n) {
                res = i;
                break;
            }
        }

        System.out.println(res);
    }
} 
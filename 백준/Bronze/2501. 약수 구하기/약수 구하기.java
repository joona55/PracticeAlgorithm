import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int res = 0;
        int i = 0;

        while(res != k) {
            i++;

            if(n < i) {
                i = 0;
                break;
            }

            if(n % i == 0) {
                res++;
            }
            else {
            }

        }

        System.out.println(i);
        // end
    } 
}
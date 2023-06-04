import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        int x = 0;

        while(count != n) {
            x++;
            int roop = x;
            while(roop >= 666) {
                if(roop % 1000 == 666) {
                    count++;
                    break;
                }
                else {
                    roop /= 10;
                }
            }
            
        }

        System.out.println(x);
    }
} 
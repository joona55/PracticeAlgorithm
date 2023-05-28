import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(true) {

            int n = sc.nextInt();
            int res = 0;
            int check = 0;
            int resCheck = 1;
            if(n == -1)
                break;
                
            for(int i = 1; i < n; i++) {
                if(n % i == 0)  {
                    res += i;
                    check++;
                }

            }

            if(n == res) {
                System.out.print(n + " = ");
                for(int i = 1; i < n; i++) {
                    if(n % i == 0) {
                        if(resCheck < check) {
                            System.out.print(i + " + ");
                            resCheck++;
                        }
                        else {
                            System.out.print(i);
                            resCheck++;
                            break;
                        }
                    }
                }
                System.out.println();
            }
            else {
                System.out.println(n + " is NOT perfect.");
            }
            
        }
    } 
}
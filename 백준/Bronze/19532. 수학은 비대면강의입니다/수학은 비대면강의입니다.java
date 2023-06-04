import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x = 0;
        int y = 0;

        for(int i = -999; i <= 999; i++) {
            for(int j = -999; j <= 999; j++) {
                int resX = (a * i) + (b * j);
                int resY = (d * i) + (e * j);

                if(resX == c) {
                    if(resY == f) {
                        x = i;
                        y = j;
                        break;
                    }
                }
            }
        }

        System.out.println(x + " " + y);
        
        //end line
    }
} 
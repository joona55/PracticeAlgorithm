import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int roop = sc.nextInt();

        int quar = 25;
        int dime = 10;
        int nick = 5;
        int penn = 1;

        int remainMoney[][] = new int[roop][4];

        for(int i = 0; i < roop; i++) {

            int dollar = sc.nextInt();

            while(dollar > 0) {
                if(dollar / quar > 0) {
                    remainMoney[i][0] = dollar / quar;
                    dollar %= quar;
                }
                else if(dollar / dime > 0) {
                    remainMoney[i][1] = dollar / dime;
                    dollar %= dime;
                }
                else if(dollar / nick > 0) {
                    remainMoney[i][2] = dollar / nick;
                    dollar %= nick;
                }
                else {
                    remainMoney[i][3] = dollar / penn;
                    dollar %= penn;
                }
            }


        }

        for(int i = 0; i < roop; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(remainMoney[i][j] + " ");
            }
            System.out.println();
        }
    // end
    }
}
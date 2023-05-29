import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int binary = sc.nextInt();

        int res = 0;

        for(int i = n.length() - 1; i >= 0; i--) {
            char m = n.charAt(i);

            int num = m;

            if(num >= 65 && num <= 90) {
                num -= 55;
            }
            else {
                num -= 48;
            }

            res += num * Math.pow(binary, (n.length() - 1) - i);

        }
        if(res <= 1000000000) {
            System.out.println(res);
        }

        //end line
    }
    // end
}
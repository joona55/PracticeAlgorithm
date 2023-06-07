import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int roop = sc.nextInt();
        int n = 1;
        int m = 3;
        int count = 0;

        while(n <= roop) {
            count++;
            n += m;
            m += 2;
        }

        System.out.println(count);
        //end line
    }
}
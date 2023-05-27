import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int roop = sc.nextInt();

        int res = 2;
        int point = 0;
        
        for(int i = 0; i < roop; i++) {
        
            res = (res * 2) - 1;

        }

        point = res * res;

        System.out.println(point);

    // end
    }
}
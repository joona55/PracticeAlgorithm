import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int roop = sc.nextInt();
        int minX = 10001;
        int maxX = -10001;
        int minY = 10001;
        int maxY = -10001;

        for(int i = 0; i < roop; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            

            if(x < minX) {
                minX = x;
            }
            
            if(x > maxX) {
                maxX = x;
            }

            if(y < minY) {
                minY = y;
            }

            if(y > maxY) {
                maxY = y;
            }
        }

        int resX = maxX - minX;
        int resY = maxY - minY;
        int resSize = resX * resY;

        System.out.println(resSize);
        
    }
    // end
}
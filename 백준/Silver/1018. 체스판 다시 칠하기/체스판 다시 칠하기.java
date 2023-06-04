import java.util.Scanner;

public class Main {

    public static boolean[][] arr;
    public static int res = 64;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        arr = new boolean[x][y];

        for(int i = 0; i < x; i++) {
            String str = sc.next();

            for(int j = 0; j < y; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
                else {
                    arr[i][j] = false;
                }
            }
        }

        for(int i = 0; i < x - 7; i++) {
            for(int j = 0; j < y - 7; j++) {
                check(i, j);
            }
        }
        
        System.out.println(res);
        //end line
    }

    public static void check(int n, int m) {
        int count = 0;

        int endX = n + 8;
        int endY = m + 8;

        boolean checkArr = arr[n][m];

        for(int i = n; i < endX; i++) {
            for(int j = m; j < endY; j++) {
                if(arr[i][j] != checkArr) {
                    count++;
                }
                checkArr = !checkArr;
            }
            checkArr = !checkArr;
        }

        if(count > 64 - count) {
            count = 64 - count;
        }

        if(count < res) {
            res = count;
        }
    }
} 
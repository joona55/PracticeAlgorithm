import java.util.Scanner;

public class Main {
    public static int[][] arr;
    public static int[][] res;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];
        res = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                res[i][j] = -1;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                arr[i][j] = sc.nextInt();
                if(i == n - 1) {
                    res[i][j] = arr[i][j];
                }
            }
        }

        int result = Triangle(0, 0);

        System.out.println(result);
        // end line
    }// end main

    public static int Triangle(int depth, int idx) {
        if(depth == n - 1) {
            return res[depth][idx];
        }

        if(res[depth][idx] == -1) {
            res[depth][idx] = Math.max(Triangle(depth + 1, idx), Triangle(depth + 1, idx + 1)) + arr[depth][idx];
        }

        return res[depth][idx];
    }
}// end class
import java.util.*;
import java.io.*;

public class Main { 

    static int r = 0;
    static int g = 1;
    static int b = 2;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   
        int arr[][] = new int[n][3];
        int tmp[][] = new int[n][3];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        tmp[0][r] = arr[0][r];
        tmp[0][g] = arr[0][g];
        tmp[0][b] = arr[0][b];
        
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                int sum = 0;
                if(tmp[i][j] == 0) {
                    if(j == r) {
                        sum = + Math.min(tmp[i-1][g], tmp[i-1][b]);
                        tmp[i][j] = arr[i][j] + sum;
                    }
                    else if(j == g) {
                        sum = + Math.min(tmp[i-1][r], tmp[i-1][b]);
                        tmp[i][j] = arr[i][j] + sum;
                    }
                    else {
                        sum = + Math.min(tmp[i-1][r], tmp[i-1][g]);
                        tmp[i][j] = arr[i][j] + sum;
                    }
                }
            }
        }

        System.out.println(Math.min(tmp[n-1][r], Math.min(tmp[n-1][g], tmp[n-1][b])));

        //end line
    }
}
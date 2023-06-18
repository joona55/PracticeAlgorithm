import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        int tmp[] = new int[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        tmp[1] = arr[1];

        if(n >= 2) {
            tmp[2] = arr[2] + arr[1];
        }
        
        for(int i = 3; i <= n; i++) {
            int check = Math.max(tmp[i - 2] + arr[i], tmp[i - 3] + arr[i - 1] + arr[i]);
            tmp[i] = Math.max(tmp[i - 1], check);
        }

        System.out.println(tmp[n]);

        //end line
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Boolean arr[] = new Boolean[1000001];
        Arrays.fill(arr, true);

        arr[0] = arr[1] = false;

        for(int i = 2; i < arr.length; i++) {
            if(arr[i]) {
                for(int j = i + i; j < arr.length; j += i) {
                    arr[j] = false;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            int count = 0;
            int t = sc.nextInt();
            for(int j = 2; j < t; j++) {
                int x = t - j;
                if(arr[j] && arr[x]) {
                    count++;
                    if(j == x) {
                        count++;
                    }
                }
            }
            System.out.println(count / 2);
        }

        //end line
    }
}
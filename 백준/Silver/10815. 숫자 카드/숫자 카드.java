import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        
        int card[] = new int[m];
        int tmp[] = new int[m];

        for(int i = 0; i < m; i++) {
            card[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < m; i++) {
            int check = card[i];

            int start = 0;
            int end = arr.length - 1;

            while(start <= end) {
                int mid = (start + end) / 2;

                if(check == arr[mid]) {
                    tmp[i]++;
                    break;
                }
                else if(check <= arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            System.out.print(tmp[i] + " ");
        }
        //end line
    }
}
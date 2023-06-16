import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int res = arr[0];

        for(int i = 1; i < n; i++ ){
            arr[i] += arr[i - 1];
            res += arr[i];
        }  

        System.out.println(res);
    }
}
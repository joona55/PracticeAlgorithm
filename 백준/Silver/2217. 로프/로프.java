import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       
        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i] * (n - i));
        }
        System.out.println(max);
        //end line
        }      
}
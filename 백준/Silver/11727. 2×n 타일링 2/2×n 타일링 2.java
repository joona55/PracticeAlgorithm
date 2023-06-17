import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   
        int arr[] = new int[1001];

        System.out.println(tilering(n, arr));

        //end line
    }
    
    public static int tilering(int n, int arr[]) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 3;

        if(arr[n] != 0)
            return arr[n];
        
        arr[n] = (tilering(n - 1, arr) + tilering(n - 2, arr) * 2) % 10007;
        
        return arr[n];
    }
}
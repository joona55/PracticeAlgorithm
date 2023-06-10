import java.util.*;
import java.io.*;

public class Main {

    static long arr[] = new long[1000001];
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        arr[0] = arr[1] = 1;

        int n = sc.nextInt();
        long res = factorial(n);

        System.out.println(res);

        //end line
    }

    public static long factorial(int n) {
        if(arr[n] == 0) {
            arr[n] = factorial(n - 1) * n;
        }

        return arr[n];
    }  
} 
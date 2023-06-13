import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10];
        int n = sc.nextInt();
        int filp = 0;
        int max = 0;

        while(n > 0) {
            int x = n % 10;
            arr[x]++;
            n /= 10;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(i != 6 && i != 9) {
                if(arr[i] > max)
                    max = arr[i];
            }
            else {
                filp += arr[i];
            }
        }

        if(filp % 2 == 1) {
            filp = filp / 2 + 1;
        }
        else {
            filp /= 2;
        }  

        if(filp > max)
            max = filp;


        System.out.println(max);
        //end line
    }
} 
import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        int arrA[] = new int[n];
        Integer arrB[] = new Integer[n];

        for(int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            sum += arrA[i] * arrB[i];
        }

        System.out.println(sum);
        //end line
        }      
}
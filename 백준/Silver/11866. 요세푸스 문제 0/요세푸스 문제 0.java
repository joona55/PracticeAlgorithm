import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[] = new int[n];
        int res[] = new int[n];
        int count = 1;
        int i = 0;
        int j = 0;

        while(j < arr.length) {
            if(arr[i] == 0) {
                if(count == k) {
                    arr[i] = 1;
                    res[j] = i + 1;
                    j++; 
                    count = 0;
                }
                count++;
            }

            i++;

            if(i > arr.length - 1) {
                i = 0;
            }
        }
        
        System.out.print("<");
        for(int x = 0; x < arr.length; x++) {
            if(x == arr.length - 1) {
                System.out.print(res[x] + ">");
            }
            else {
                System.out.print(res[x] + ", ");
            }
        }
        //end line
    }
}  

import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   
        int arr[] = new int[n];
        int tmp[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        tmp[0] = arr[0];
        int max = arr[0];

        for(int i = 1; i < n; i++) {
            // 현재 값이 큰지 이전 값과 현재 값이 더한 값이 큰지 비교하여
            // 연속으로 더할지 결정한다.
            if(arr[i] > arr[i] + tmp[i-1]){
                tmp[i] = arr[i];
            }
            else {
                tmp[i] = arr[i] + tmp[i-1];
            }

            if(tmp[i] > max) {
                max = tmp[i];
            }
        }
        

        System.out.println(max);

        //end line
    }
}
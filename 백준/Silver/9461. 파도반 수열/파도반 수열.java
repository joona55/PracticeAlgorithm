import java.util.*;
import java.io.*;

public class Main {
    /*
     * 동적 계획법 Top down (재귀 + 메모이제이션)
     * 재귀를 통해 반복되는 수를 배열에 저장함으로써 불필요한
     * 반복을 줄인다.
     */
    static long arr[] = new long[101];
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        arr[0] = 0;
        arr[1] = arr[2] = arr[3] = 1;

        for(int i = 0; i < loop; i++) {
            int n = sc.nextInt();
            
            long res = padovan(n);
            System.out.println(res);
        }

        //end line
    }

    public static long padovan(int n) {
        if(arr[n] == 0 && n > 2) {
            arr[n] = padovan(n - 2) + padovan(n - 3);
            //arr[n]이 값을 가지고 있지 않다면 재귀
        }       
        return arr[n];
        //arr[n] 안에 있는 값을 리턴해준다.
    }
    
} 
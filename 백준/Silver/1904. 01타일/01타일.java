import java.util.*;
import java.io.*;

public class Main {
    /*
     * 동적 계획법 Top down (재귀 + 메모이제이션)
     * 재귀를 통해 반복되는 수를 배열에 저장함으로써 불필요한
     * 반복을 줄인다.
     */
    static int arr[] = new int[1000001];
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        int res = zeroTile(n);

        System.out.println(res);

        //end line
    }

    public static int zeroTile(int n) {
        if(arr[n] == 0 && n > 2) {
            return arr[n] = (zeroTile(n - 1) + zeroTile(n - 2)) % 15746;
        }

        return arr[n];
    }  
} 
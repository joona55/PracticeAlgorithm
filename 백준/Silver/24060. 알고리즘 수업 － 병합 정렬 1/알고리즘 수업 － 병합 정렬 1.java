import java.util.*;
import java.io.*;

public class Main {
    
    static int[] tmp;
    static int count;
    static int res = -1;
    static int k;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        k = sc.nextInt();

        int arr[] = new int[n];
        tmp = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(res);

        //end line
    }

    public static void mergeSort(int[] arr, int p, int r) {
            if(p < r) {
                int q = (p + r) / 2;
                mergeSort(arr, p, q);
                mergeSort(arr, q + 1, r);
                merge(arr, p, q, r);
            }
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        while(i <= q && j <= r) {
            if(arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            }
            else {
                tmp[t++] = arr[j++];
            }
        }
        while (i <= q) {
            tmp[t++] = arr[i++];
        }
        while (j <= r) {
            tmp[t++] = arr[j++];
        }
        i = p;
        t = 0;
        while(i <= r) {
            count++;
            if(count == k) {
                res = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        } 
    }
}  
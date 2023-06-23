import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int arr[] = new int[n];
        int tmp[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();


        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            tmp[i] = arr[i];
        }

        Arrays.sort(tmp);
        
        int in = 0;

        for(int i : tmp) {
            if(map.containsKey(i) == false) {
                map.put(i, in);
                in++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            int res = map.get(i);
            sb.append(res).append(' ');
        }
        
        System.out.println(sb);
        //end line
    }      
}
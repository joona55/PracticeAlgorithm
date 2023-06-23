import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int key = sc.nextInt();

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int m = sc.nextInt();  
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            int key = sc.nextInt();

            sb.append(map.getOrDefault(key, 0)).append(' ');
        }

        System.out.println(sb);
        //end line
    }
}
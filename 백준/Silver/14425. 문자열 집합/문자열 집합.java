import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        HashMap<Integer, String> mapS = new HashMap<>(n);
        String arr[] = new String[m];

        for(int i = 0; i < n; i++) {
            mapS.put(i, sc.next());
        }

        for(int i = 0; i < m; i++) {
            arr[i] = sc.next();
        }

        for(int i = 0; i < n; i++) {
            String str = mapS.get(i);
            for(int j = 0; j < m; j++) {
                if(str.equals(arr[j]))
                    count++;
            }           
        }

        System.out.println(count);
        //end line
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>(n);

        for(int i = 0; i < n; i++) {
            String name = br.readLine();
            String key = String.valueOf(i + 1);
            map.put(name, key);
            map.put(key, name);
        }

        for(int i = 0; i < m; i++) {
            System.out.println(map.get(br.readLine()));
        }
    }
}  
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;

        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        HashSet<String> set = new HashSet<String>();

        for(int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> res = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            if(set.contains(str)) {
                res.add(str);
            }
        }

        Collections.sort(res);

        System.out.println(res.size());
        for(int i = 0; i < res.size(); i++) {
            String str = res.get(i);
            System.out.println(str);
        }
        //end line
    }
}
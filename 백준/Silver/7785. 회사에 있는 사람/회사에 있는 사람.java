import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>(n);
        
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String str = sc.next();

            if(str.equals("enter")) {
                set.add(name);
            }
            else if(str.equals("leave")) {
                set.remove(name);
            }
        }

        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        //end line
    }
}  

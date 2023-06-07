import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[26];
        int roop = sc.nextInt();
        int check = 1;
        int count = 0;

        for(int i = 0; i < roop; i++) {
            String str = sc.next();
            check = 1;

            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                int n = ch - 97;
                arr[n]++;

                if(arr[n] >= 2) {
                    if(ch != str.charAt(j - 1)) {
                        check = 0;
                    }
                }
            }

            for(int k = 0; k < arr.length; k++) {
                arr[k] = 0;
            }

            if(check == 1)
                count++;
        }

        System.out.println(count);

        //end line
    }
} 
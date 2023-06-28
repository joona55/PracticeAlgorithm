import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            
            if(ch >= 97 && ch <= 122) {
                ch -= 32;
                sb.append(ch);
            }
            else {
                ch += 32;
                sb.append(ch);
            }
        }

        str = sb.toString();
        System.out.println(str);
    }
}
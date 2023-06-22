import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String arr[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int arrMon[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        int month = sc.nextInt();
        int day = sc.nextInt();

        int res = day;

        for(int i = 0; i < month - 1; i++) {
            res += arrMon[i];
        }

        System.out.println(arr[res % 7]);

        //end line
    }      
}
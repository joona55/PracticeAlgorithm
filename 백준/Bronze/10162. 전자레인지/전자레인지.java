import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        int a = 60 * 5;
        int b = 60;
        int c = 10;

        int arr[] = new int[3];
        int check = 0;

        while(t > 0) {
            if(t >= a) {
                arr[0] += t / a;
                t %= a;        
            }
            else if(t >= b) {
                arr[1] += t / b;
                t %= b;
            }
            else {
                if(t % c > 0) {
                    check = -1;
                    break;
                }
                else {
                    arr[2] += t / c;
                    t %= c;
                }
            }
        }

        if(check != -1) {
            for(int i = 0; i < 3; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else {
            System.out.println(check);
        }
        
        
        //end line
    }
}
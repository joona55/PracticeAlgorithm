import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int roop = sc.nextInt();
        int arr[] = new int[roop];
        int distance[] = new int[roop - 1];
        int count = 0;
        int n = 0;

        for(int i = 0; i < roop; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = roop - 1; i > 0; i--) {
            distance[count]= arr[i] - arr[i - 1];
            count++;
        }
        
        int res = distance[0];

        for(int i = 1; i < distance.length; i++) {
            res = gcd(res, distance[i]);
        }
        
        for(int i = 0; i < distance.length; i++) {
            n += (distance[i] / res) - 1;
        }
        
        System.out.println(n);
    }
    public static int gcd(int a, int b) {
        int c = 0;

        while(b > 0) {
            c = a % b;
            a = b;
            b = c;
        }

        return a;
    }
} 
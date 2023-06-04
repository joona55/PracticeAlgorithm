import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = 5;
        int arr[] = new int[n];
        int avg = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            avg += arr[i];
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }

        avg /= 5;

        System.out.println(avg);
        System.out.println(arr[n/2]);
        //end line
    }
}
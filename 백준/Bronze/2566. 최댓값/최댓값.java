import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int size = 9;
        int arr[][] = new int[size][size];
        int max = -1;
        int pointX = 0;
        int pointY = 0;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    pointX = i + 1;
                    pointY = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(pointX + " " + pointY);

        //end line
    }
    // end
}
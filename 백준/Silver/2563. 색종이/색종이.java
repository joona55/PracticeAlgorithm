import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[100][100];

        int roop = sc.nextInt();
        int size = 0;

        for(int i = 0; i < roop; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(arr[j][k] == 0) {
                        arr[j][k] = 1;
                        size++;
                    }
                }
            }
        }

        System.out.println(size);
    // end
    }
}
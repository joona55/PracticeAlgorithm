import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[5];
        char chArr[][] = new char[5][15];
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }

        for(int i = 0; i < 5; i++) {
           for(int j = 0; j < arr[i].length(); j++) {
                chArr[i][j] = arr[i].charAt(j);
           }
        }

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {

                if(chArr[j][i] != 0)
                    System.out.print(chArr[j][i]);
                
            }
        }
    // end
    }
}
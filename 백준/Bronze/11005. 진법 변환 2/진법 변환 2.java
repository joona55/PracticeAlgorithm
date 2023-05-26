import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int copyN = n;

        int roop = 0;

        while(copyN > 0) {
            copyN /= b;
            roop++;
        }
        
        char arr[] = new char[roop];


        for(int i = 0; i < roop; i++) {
            int remain = n % b;

            char ch = 'A';
            if(remain >= 10) {
                ch = (char) (remain + 55);
                arr[i] = ch;
            }
            else{
                ch = (char) (remain + 48);
                arr[i] = ch;
            }
            n /= b;

        }

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        //end line
    }
    // end
}
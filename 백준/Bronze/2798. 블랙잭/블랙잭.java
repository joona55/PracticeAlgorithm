import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int roop = sc.nextInt();
        int max = sc.nextInt();
        int numArr[] = new int[roop];
        int res = 0;

        for(int i = 0; i < roop; i++) {
            numArr[i] = sc.nextInt(); 
        }

        for(int i = 0; i < roop; i++) {
            for(int j = 0; j < roop; j++) {
                for(int k = 0; k < roop; k++) {
                    if(i == j || j == k || k == i)
                        break;
                    
                    int x = numArr[i] + numArr[j] + numArr[k];

                    if(x <= max && x > res) 
                        res = x;
                }
            }
        }


        System.out.println(res);
        //end line
    }
} 
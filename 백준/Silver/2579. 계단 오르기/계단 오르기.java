import java.util.Scanner;

public class Main {
    public static int[] cost;
    public static Integer[] res;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        cost = new int[n + 1];
        res = new Integer[n + 1];

        for(int i = 1; i < n + 1; i++) {
            cost[i] = sc.nextInt();
        }

        res[0] = cost[0];
        res[1] = cost[1];

        if(n >= 2) {
            res[2] = cost[1] + cost[2];
        }

        System.out.println(Stair(n));
        // end line
    }// end main

    public static int Stair(int x) {
        if(res[x] == null) {
            res[x] = Math.max(Stair(x - 2), Stair(x - 3) + cost[x - 1]) + cost[x];
        }

        return res[x];
    }
}// end class
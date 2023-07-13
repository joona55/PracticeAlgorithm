import java.util.*;
import java.io.*;

public class Main {
    public static int topNum = -1;
    public static int[] stack = new int[10001];
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        while(n > 0) {
            String str = sc.next();
            if(str.equals("push")) {
                int x = sc.nextInt();
                push(x);
            }
            else if(str.equals("pop")) {
                int res = pop();
                sb.append(res).append("\n");
            }
            else if(str.equals("size")) {
                int res = size();
                sb.append(res).append("\n");
            }
            else if(str.equals("empty")) {
                int res = empty();
                sb.append(res).append("\n");
            }
            else if(str.equals("top")) {
                int res = top();
                sb.append(res).append("\n");
            }
            
            n--;
        }
		
        System.out.println(sb);
		// end line
	}// end main
	
	public static void push(int x) {
        topNum++;
        stack[topNum] = x;
	}


	public static int pop() {
        if(topNum == -1) {
            return -1;
        }
        else {
            int res = stack[topNum];
            stack[topNum] = 0;
            topNum--;
            return res;
        }
        
	}


	public static int size() {
        return topNum + 1;
	}


	public static int empty() {
        if(topNum == -1) {
            return 1;
        }
        else {
            return 0;
        }
	}


	public static int top() {
        if(topNum == -1) {
            return -1;
        }
        return stack[topNum];
	}
	
}
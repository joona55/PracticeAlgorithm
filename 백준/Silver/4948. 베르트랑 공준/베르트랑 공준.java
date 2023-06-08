import java.util.*;
public class Main {
	public static boolean prime[] = new boolean[246913];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			} 
		}
		
		while(true) {
			int n = sc.nextInt();
			
			if(n == 0)
				break;
			
			int count = 0;
			
			for(int i = n + 1; i <= n * 2; i++) {
				if(!prime[i])
					count++;
			}
			System.out.println(count);
		}
		
		// end line
	}// void main
}// class Main
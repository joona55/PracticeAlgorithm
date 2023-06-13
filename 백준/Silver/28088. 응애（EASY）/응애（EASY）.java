import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;

    int arr[] = new int[n];
    int tmp[] = new int[n];
    
    for(int i = 0; i < m; i++) {
      int num = sc.nextInt();
      arr[num] = 1;
      tmp[num] = 1;
    }
    
    for(int i = 0; i < k; i++) {
      for(int j = 0; j < n; j++) {
        if(arr[j] == 1) {
          if(j == 0) {
            tmp[j+1]++;
            tmp[n-1]++;
          }
          else if(j == n-1) {
            tmp[0]++;
            tmp[j-1]++;
          }
          else {
            tmp[j+1]++;
            tmp[j-1]++;
          }
        }
      }


      for(int j = 0; j < n; j++) {
        tmp[j] -= arr[j];

        if(tmp[j] >= 2) {
          tmp[j] = 0;
        }
        
        arr[j] = tmp[j];
      }
    }

    for(int i = 0; i < n; i++) {
      if(arr[i] == 1) {
        count++;
      }
    }

    System.out.println(count);
    
  }
}
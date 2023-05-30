import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    

    int numArr[] = new int[3];

    int max = 0;

    int res = 0;

    for(int i = 0; i < 3; i++) {

      numArr[i] = sc.nextInt();

      

      if(numArr[i] > max) {

        max = numArr[i];

      }

      

    }

    if(numArr[0] == max) {

      if(numArr[0] < numArr[1] + numArr[2])

        res = numArr[0] + numArr[1] + numArr[2];

      else

        res = (numArr[1] + numArr[2]) * 2 - 1;

      

    }

    else if(numArr[1] == max) {

      if(numArr[1] < numArr[0] + numArr[2])

        res = numArr[0] + numArr[1] + numArr[2];

      else

        res = (numArr[0] + numArr[2]) * 2 - 1;   

   }

    else if(numArr[2] == max) {

      if(numArr[2] < numArr[0] + numArr[1])

        res = numArr[0] + numArr[1] + numArr[2];

      else

        res = (numArr[0] + numArr[1]) * 2 - 1;   

    }

    System.out.println(res);

  }

}
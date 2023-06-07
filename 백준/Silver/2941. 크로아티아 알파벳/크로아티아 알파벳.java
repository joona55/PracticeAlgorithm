import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    int len = str.length();

    int count = 0;

    

    for(int i = 0; i < len; i++) {

      char ch = str.charAt(i);

      if(ch == 'c' && i < len-1) {

        if(str.charAt(i+1) == '=')

          i++;

        else if(str.charAt(i+1) == '-')

          i++;

      }

      else if(ch == 'd' && i < len-1) {

        if(str.charAt(i+1) == 'z') {

           if(i < len-2) {

             if(str.charAt(i+2) == '=')

              i += 2;  

           }

         }

         else if(str.charAt(i+1) == '-') 

           i++;

      }

        

      else if(ch == 'l' && i < len-1) {

        if(str.charAt(i+1) == 'j')

          i++;

      }

      else if(ch == 'n' && i < len-1) {

        if(str.charAt(i+1) == 'j')

          i++;

      }

      else if(ch == 's' && i < len-1) {

        if(str.charAt(i+1) == '=')

          i++;

      }

      else if(ch == 'z' && i < len-1) {

        if(str.charAt(i+1) == '=')

          i++;

      }

      count++;

    }

    System.out.println(count);

    //endline

  }

}
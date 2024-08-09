package elseif;

import java.util.Scanner;

import static java.lang.System.in;


public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();
        System.out.println(n);

   if (n%2==0){
       System.out.println("The no  you enter is even" );
   }

   if( n%2!=0) {
            System.out.println(" the no is odd");
        }

    }
}

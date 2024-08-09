
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your principle");
        float p = sc.nextFloat();

        System.out.println(" Enter your interest");
        float r = sc.nextFloat();

        System.out.println("Enter time");
        float t = sc.nextFloat();

        float s1 = (p*r*t)/100;

        System.out.println("principle"+p);
        System.out.println("rate"+r);
        System.out.println("time"+t);


        System.out.println("Simple Interest"+s1);



    }
}

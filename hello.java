import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = Sc.nextInt();
        if (n> 00 && n<100)
        {
            System.out.println("NUMBER IS 2 DIGIT");
        }
        else {
            System.out.println(" NUMBER IS NOT 2 DIGIT");
        }
    }
}
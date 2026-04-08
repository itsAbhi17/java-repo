import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        int[] marks = new int[5];
        String name;
        int total = 0;
        float percentage;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        name = sc.nextLine();

        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        percentage = total / 5.0f;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}

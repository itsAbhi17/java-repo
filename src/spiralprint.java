import java.util.Scanner;

public class spiralprint{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        printSpiralPattern(n);
    }

    static void printSpiralPattern(int size) {
        int[][] matrix = new int[size][size];
        int row = 0, col = 0;
        int boundary = size - 1;
        int sizeLeft = size - 1;
        int flag = 1;
        char move = 'r'; // r = right, l = left, d = down, u = up

        for (int i = 1; i <= size * size; i++) {
            matrix[row][col] = i;

            switch (move) {
                case 'r':
                    col += 1;
                    break;
                case 'l':
                    col -= 1;
                    break;
                case 'u':
                    row -= 1;
                    break;
                case 'd':
                    row += 1;
                    break;
            }

            if (i == boundary) {
                boundary += sizeLeft;
                if (flag != 2) {
                    flag = 2;
                } else {
                    flag = 1;
                    sizeLeft -= 1;
                }

                switch (move) {
                    case 'r':
                        move = 'd';
                        break;
                    case 'd':
                        move = 'l';
                        break;
                    case 'l':
                        move = 'u';
                        break;
                    case 'u':
                        move = 'r';
                        break;
                }
            }
        }

        // Print the spiral matrix
        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

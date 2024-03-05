import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.next();
        }
        int rows = scanner.nextInt();

        printRightAngleTriangle(rows);

        scanner.close();
    }

    private static void printRightAngleTriangle(int rows) {
        if (rows <= 0) {
            System.out.println("Invalid input. Please enter a positive integer for the number of rows.");
            return;
        }

        System.out.println("Right-Angled Triangle Pattern:");

        for (int i = 1; i <= rows; i++) {
            // Print repeating numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}


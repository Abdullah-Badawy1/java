import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");
        printMultiplicationTable(number);

        scanner.close();
    }

    private static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}


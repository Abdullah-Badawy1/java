import java.util.Scanner;

public class FactorsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();
        }
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");
        printFactors(number);

        scanner.close();
    }

    private static void printFactors(int number) {
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}


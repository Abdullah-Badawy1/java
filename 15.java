import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent (power): ");
        int exponent = scanner.nextInt();

        double result = calculatePower(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }

    private static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            System.out.println("Exponent should be a non-negative integer.");
            return -1; // Indicates an error
        }

        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}


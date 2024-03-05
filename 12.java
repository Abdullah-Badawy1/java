import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.next();
        }
        int n = scanner.nextInt();

        displayHarmonicSeries(n);

        scanner.close();
    }

    private static void displayHarmonicSeries(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        double sum = 0;
        System.out.print("Harmonic Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
            sum += 1.0 / i;
        }

        System.out.println("\nSum of the Harmonic Series: " + sum);
    }
}


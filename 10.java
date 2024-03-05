import java.util.Scanner;

public class SeriesSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.next();
        }
        int n = scanner.nextInt();

        double sum = calculateSeriesSum(n);

        System.out.println("Sum of the series is: " + sum);

        scanner.close();
    }

    private static double calculateSeriesSum(int n) {
        if (n <= 0) {
            return 0; 
        }

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(i, i);
        }

        return sum;
    }
}


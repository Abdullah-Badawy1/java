import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.next();
        }
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. Please enter a positive integer.");
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("# ");
                }
                System.out.println();             }
        }

        scanner.close();
    }
}

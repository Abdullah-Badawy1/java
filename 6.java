import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = findStringLength(inputString);

        System.out.println("Length of the string is: " + length);

        scanner.close();
    }

    private static int findStringLength(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }
}


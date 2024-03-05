import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("1.  (+)");
        System.out.println("2.  (-)");
        System.out.println("3.  (*)");
        System.out.println("4.  (/)");

        System.out.print("Enter the operation number: ");
        int operation = sc.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
				if (num2 != 0) {
					result = num1 / num2;
                }
				else
				{
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Please choose a number between 1 and 4.");
                return;
        }

        System.out.println("Result: " + result);
    }
}


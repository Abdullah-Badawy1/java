import java.util.Scanner;

public class FlightReservationSystem {

    private static String firstName;
    private static String lastName;
    private static String destinationCountry;
    private static int availableSeats = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice (1-3, 0 to exit): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    makeReservation(scanner);
                    break;
                case 2:
                    cancelReservation(scanner);
                    break;
                case 3:
                    checkLocalWeather();
                    break;
                case 0:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 3.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n===== Flight Reservation System =====");
        System.out.println("1. Make a Reservation");
        System.out.println("2. Cancel a Reservation");
        System.out.println("3. Check Local Weather");
        System.out.println("0. Exit");
        System.out.println("=====================================");
    }

    private static void makeReservation(Scanner scanner) {
        System.out.print("Enter the destination country for a one-way trip: ");
        destinationCountry = scanner.nextLine();

        int seatsToBook = 0;
        do {
            System.out.print("Enter the number of seats you want to book (1-" + availableSeats + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            seatsToBook = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (seatsToBook < 1 || seatsToBook > availableSeats) {
                System.out.println("Invalid number of seats. Please enter a valid number.");
            }
        } while (seatsToBook < 1 || seatsToBook > availableSeats);

        // Update available seats
        availableSeats -= seatsToBook;

        System.out.println("\nReservation Successful!");
        System.out.println("Hello, " + firstName + " " + lastName + "!");
        System.out.println("You have booked " + seatsToBook + " seat(s) to " + destinationCountry + ".");
        System.out.println("Available seats: " + availableSeats);
    }

    private static void cancelReservation(Scanner scanner) {
        System.out.print("Enter the destination country of your reservation: ");
        String cancelDestination = scanner.nextLine();

        if (cancelDestination.equalsIgnoreCase(destinationCountry)) {
            int seatsToCancel = 0;
            do {
                System.out.print("Enter the number of seats you want to cancel (1-" + availableSeats + "): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
                seatsToCancel = scanner.nextInt();
                scanner.nextLine(); 

                if (seatsToCancel < 1 || seatsToCancel > availableSeats) {
                    System.out.println("Invalid number of seats. Please enter a valid number.");
                }
            } while (seatsToCancel < 1 || seatsToCancel > availableSeats);

            availableSeats += seatsToCancel;

            System.out.println("\nCancellation Successful!");
            System.out.println("Hello, " + firstName + " " + lastName + "!");
            System.out.println("You have canceled " + seatsToCancel + " seat(s) to " + destinationCountry + ".");
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("No reservation found for the specified destination.");
        }
    }

    private static void checkLocalWeather() {
        // Simulate checking local weather
        System.out.println("\nChecking local weather for " + destinationCountry + "...");
        System.out.println("Weather report: Sunny and 25°C");
    }
}

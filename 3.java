import java.util.Scanner;

public class JobApplicationChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = sc.nextInt();

        System.out.print("What is your level of education? ");
        String educationLevel = sc.next().toLowerCase();

        System.out.print("How many years of experience ");
        int experienceYears = sc.nextInt();

        System.out.print("Do you have any certifications? ");
        String certifications = sc.next().toLowerCase();

        System.out.print("Are you proficient in  programming languages?");
        String programmingProficiency = sc.next().toLowerCase();

        if (age > 40 &&
            ("university".equals(educationLevel) || "college".equals(educationLevel)) &&
            experienceYears >= 2 &&
            "yes".equals(certifications) &&
            "yes".equals(programmingProficiency)) {
            System.out.println("Congratulations!");
        } else {
            System.out.println(" you do not meet the criteria for this job ");
        }
    }
}


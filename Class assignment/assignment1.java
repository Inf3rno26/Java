import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter Student Marks: ");
            int marks = scanner.nextInt();
            char grade;

            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 75) {
                grade = 'B';
            } else if (marks >= 50) {
                grade = 'C';
            } else {
                grade = 'F';
            }

            switch (grade) {
                case 'A':
                    System.out.println("The student has got A grade - That means Excellent");
                    break;

                case 'B':
                    System.out.println("The student has got B grade - That means Good");
                    break;
                case 'C':
                    System.out.println("The student has got C grade - That means Average");
                    break;
                case 'F':
                    System.out.println("The student has got F grade - That means Failed!");
                    break;
            }
            System.out.print("Do you want to check another student? (y/n): ");
            choice = scanner.next().charAt(0);;

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }

}

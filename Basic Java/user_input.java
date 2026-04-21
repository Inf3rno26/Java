import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // System.out.print("Enter your GPA: ");
        // double gpa = scanner.nextDouble();

        // System.out.print("Are you Still Studying?: ");
        // boolean isStudying = scanner.nextBoolean();

        System.out.println("Hello, Your name is " + name);
        System.out.println("You are this " + age + " Year old!");
        // System.out.println("Your GPA is: " + gpa);
        // System.out.println("Is he studying now?: "+ isStudying);

        scanner.close();

    }
}

import java.util.Scanner;

public class if_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int age = 25;
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } 
        else if (age > 60){
            System.out.println("You are a senior Citizen!");
        }
        
        else {
            System.out.println("You are not adult!");
        }

        scanner.close();
    }
}

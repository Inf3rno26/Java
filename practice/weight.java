import java.util.Scanner;

public class weight {
    public static void main(String[] args) {

        // declaring variables
        Scanner scanner = new Scanner(System.in);

        int choice;
        double originalWeight;
        double convertedWeight;

        // welcome message
        System.out.println("Welcome to the Weight Converter!!!");

        // promot for entering which weight
        System.out.print("Enter your Weight type (1 - to KGs, 2 - To Pounds): ");
        choice = scanner.nextInt();

        // option 1 - kgs to lbs
        if (choice == 1) {
            System.out.print("Enter your weight (in Kgs): ");
            originalWeight = scanner.nextDouble();
            convertedWeight = originalWeight * 2.205;
            System.out.printf("Your Converted weight to Pounds is: %.2f Lbs", convertedWeight);
        }

        // option 2 - lbs to kgs
        else if (choice == 2) {
            System.out.print("Enter your weight (in Lbs): ");
            originalWeight = scanner.nextDouble();
            convertedWeight = originalWeight / 2.205;
            System.out.printf("Your Converted weight to Kilograms is: %.2f Kgs", convertedWeight);
        }

        // option 3 - else / not a valid choice
        else{
            System.out.println("Please try again! not a invalid choice.");
        }
    scanner.close();   
    }
}

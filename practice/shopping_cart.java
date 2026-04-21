import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Item name: ");
        String item_Name = scanner.nextLine();

        System.out.print("Enter the Price of the " + item_Name + ": ");
        double item_Price = scanner.nextDouble();

        System.out.print("Enter the Quantity of the " + item_Name + ": ");
        int item_Quantity = scanner.nextInt();

        double total_bill = item_Price * item_Quantity;
        
        System.out.println("Your total Bill is: $" + total_bill);

        scanner.close();
    }
}

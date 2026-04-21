import java.util.Scanner;

// static Scanner scanner=new Scanner(System.in);

public class banking {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // declare variables

        double balance = 0;
        boolean isRunning = true;
        int choice;

        // menu interfacce
        while (isRunning) {
            System.out.println("---------------------------------");
            System.out.println("------ BANKING PROGRM -----");
            System.out.println("Choose from the Following Options");
            System.out.println("1. Show Balance! ");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Deposit mount");
            System.out.println("4. Exit!");

            // user choices

            System.out.print("Enter your Choice (1,2,3,4): ");
            choice = scanner.nextInt();
            // System.out.println("");
            // show balances
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance - withdraw(balance);
                case 3 -> balance = balance + deposit();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!");

            }
        }
        System.out.println("Thank you for using!");
        scanner.close();
    }

    // show balance
    static void showBalance(double balance) {
        System.out.println("---------------------------------");
        System.out.printf("Your balance is: $%.2f \n", balance);
    }

    // withdraw method

    static double withdraw(double balance) {
        System.out.print("Enter the amount you want to withdraw: ");
        double amount;
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.printf("------------- \n Insufficent Balance! \n -----------");
            return 0;
        } else {
            System.out.println(" ---------\n Money Withdraw Successfully \n -------------");
            return amount;
        }
    }

    // deposit
    static double deposit() {

        double amount;

        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative!");
            return 0;
        } else {
            return amount;
        }
    }

}
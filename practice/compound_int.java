import java.util.Scanner;

public class compound_int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmount;
        System.out.print("Enter the Principal Amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the Interest Rate: ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the Number of Times Interest: ");
        int interestTime = scanner.nextInt();

        System.out.print("Enter the Duration of this: ");
        int time = scanner.nextInt();

        totalAmount = principalAmount * Math.pow(1 + interestRate / interestTime , interestTime * time);

        System.out.println("You final amount is : $" + totalAmount);


        scanner.close();

    }
}

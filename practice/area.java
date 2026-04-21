import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Length: ");
        int Length = scanner.nextInt();

        System.out.print("Enter your Breadth: ");
        int Breadth = scanner.nextInt();

        double area_rect = Length * Breadth;

        System.out.println("The Area of Rectangle is: "+ area_rect + "unit^2 ");

        scanner.close();
    }
}

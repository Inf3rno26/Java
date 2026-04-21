import java.util.Scanner;

// public class userinput_array {
// static Scanner scanner = new Scanner(System.in);
// public static void main(String[] args){
//     String[] foods = new String[5];

//     for(int i=0; i<foods.length; i++){
//         System.out.print("Enter a food: ");
//         foods[i] = scanner.nextLine();
//     }

//     for(String food : foods){
//         System.out.println(food);
//     }
//     // System.out.println(foods.length);
//     scanner.close();
// }
// }

public class userinput_array {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        String[] foods;

        System.out.print("Enter the # of Foods: ");
        size = scanner.nextInt();
        scanner.nextLine(); //for clearing input buffer

        foods = new String[size];


        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter #" + (i+1) + " food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }
        // System.out.println(foods.length);
        scanner.close();

    }
}
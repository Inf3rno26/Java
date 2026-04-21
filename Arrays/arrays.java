import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] fruits = { "banana", "apple", "oranges" };

        // int numOfFruits = fruits.length;

        // System.out.println(fruits[1]);
        // System.out.println(numOfFruits);

        // normal for loop
        // for (int i = 0; numOfFruits > i; i++) {
        //     System.out.println(fruits[i]);
        // }

        // enanched for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // sorting
        Arrays.sort(fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}

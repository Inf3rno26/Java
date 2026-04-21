//integer searching 

// public class array_search {
//     public static void main(String[] args) {
//         int[] numbers = { 2, 4, 5, 6, 7 };
//         int target = 9;
//         boolean isFound = false;

//         for (int i = 0; i < numbers.length; i++) {
//             if (target == numbers[i]) {
//                 System.out.println("Element found at index: " + i);
//                 isFound = true;
//                 break;
//             }
//         }

//         if (!isFound) {
//             System.out.println("Element Not found in the Array!");
//         }
//     }
// }

//string search

public class array_search{
    public static void main(String[] args) {
        String[] fruits = {"pineapple", "apple", "watermelon"};
        String target = "apple";
        boolean isFound = false;

        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i );
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in array!");
        }
    }
}


// public class TwoDArray {
//     public static void main(String[] args) {
//         // String [] fruits = {"apple", "orange", "mangoes"};
//         // String [] vegetable = {"potato", "tomato", "cabbage"}; 
//         // String [] misc = {"Sugar", "Rice", "Oil"};

//         String[][] groceries = {{"apple", "orange", "mangoes"}, 
//                                 {"potato", "tomato", "cabbage"},
//                                 {"Sugar", "Rice", "Oil"}};

//         groceries[0][1] = "banana";

//         for(String[] foods : groceries ){
//             for(String food : foods){ //working with string
//                 System.out.print(food + " ");
//             }
//             System.out.println("");
//         }
//     }
// }

public class TwoDArray {
    public static void main(String[] args) {
        String[][] telephone = { { "1", "2", "3" },
                { "4", "5", "6" },
                { "7", "8", "9" },
                { "*", "0", "#" }};

        for (String[] keypads : telephone){
            for(String keypad : keypads){
                System.out.print( keypad + " ");
            }
            System.out.println();
        }                
        
    }
}

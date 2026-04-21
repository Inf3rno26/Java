// public class varargs {
//     public static void main(String[] args){
//         System.out.println(add(2,2));

//     }

//     static int add(int... numbers){
//         // System.out.println(numbers);

//         int sum = 0;
//         for(int number : numbers){
//             sum += number;
//         }

//         return sum;
//     }
// }
public class varargs{
    public static void main(String[] args) {
        System.out.println(average(1,2));
    }

    static double average(double... numbers){
        double sum = 0;

        for (double number : numbers){
            sum += number;
        }

        return sum/numbers.length;

    }
}

public class switches {
    public static void main(String[] args) {
        int day = 9;

        switch (day) {
            case 1, 2, 3, 4, 5  -> System.out.println("Today is Weekday");
            case 6, 7 -> System.out.println("Today is Weeknds");
            default -> System.out.println("Invalid Day");
        }
    }
}

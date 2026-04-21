import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();


        boolean isHead;
        isHead = random.nextBoolean();
        System.out.println("Is it head: " + isHead);
    }
}

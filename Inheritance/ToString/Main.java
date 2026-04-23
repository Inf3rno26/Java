package ToString;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2025, "Red");

        System.out.println(car); //normal hash output

        System.out.println(car.color + " " + car.year);
    }
}

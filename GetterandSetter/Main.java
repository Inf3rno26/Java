// package getterandsetters;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Yellow", 25000);

        // car.color = "Blue"; // this wont be changed as color is private

        car.setModel("Hyndai");
        car.setColor("Blue");
        car.setPrice(8000);

        System.out.println(car.getModel() + " " + car.getcolor() + " " + car.getPrice());
    }
}

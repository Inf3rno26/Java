// package getterandsetters;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        // car.color = "Blue"; // this wont be changed as color is private

        // car.getModel;
        car.setModel("Hyndai");
        car.setColor("Blue");
        car.setPrice(8000);

        car2.setModel("Lambo");
        car2.setColor("Yellow");
        car2.setPrice(2500);

        System.out.println(car.getModel() + " " + car.getcolor() + " " + car.getPrice());
        System.out.println(car2.getModel() + " " + car2.getcolor() + " " + car2.getPrice());
    }
}

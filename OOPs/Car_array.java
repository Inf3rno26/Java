public class Car_array {
    String model;
    String color;


    Car_array(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.model );
    }

    public static void main(String[] args){
        // Car_array car1 = new Car_array("Ford", "Blue");
        // Car_array car2 = new Car_array("Ford", "Blue");
        // Car_array car3 = new Car_array("Ford", "Blue");

        Car_array cars[] = {new Car_array("Ford", "Red"),new Car_array("Ferrari", "Red"),new Car_array("Ford", "Red")};

        for(Car_array car : cars){
            car.drive();
        }
    }
}

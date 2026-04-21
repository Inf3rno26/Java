public class main {

    public static void main(String[] args) {
        Car car = new Car();
        // car.isRunning = false;

        // System.out.println(car.model);
        // System.out.println(car.year);
        // System.out.println(car.isRunning);

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        
    }
    
}

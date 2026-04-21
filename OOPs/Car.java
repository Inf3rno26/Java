
public class Car{
    
    String make = "Toyota";
    String model = "Glanza";
    int year = 2019;
    double price = 700000.99;
    boolean isRunning = false;

    void start(){
        boolean isRunning = true;
        System.out.println("You started the engine");
    }

    void stop(){
        boolean isRunning = false;
        System.out.println("You stopped the engine");
    }
}
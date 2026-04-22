# Object- An entity that holds the data (attributes), and can perform actions (methods).

- It is a reference data type.

## For making Objects - First we have to make the Class which is like blueprint of something

In this example - we will follow the Car example:

- first we will make car class under [car.java](http://car.java) file

```java
public class car{
    String make = "Toyota";
    String model = "Glanza";
    int year = 2019;
    double price = 700000.99;
    boolean isRunning = true;
}
```

- then we make [main.java](http://main.java) file
- So, while we call out the variables from the Class, we have to use “.” (dot) keyword to access them.

```java

public class main {

    public static void main(String[] args) {
        Car car = new Car(); //first "Car" is the class name, and 
         //second "car" is the variable in this class to call out the other class.

        System.out.println(car.model); //dot keyword
        System.out.println(car.year); //as its reference data type, it wont be printed directly
		    System.out.println(car.make);
		    System.out.println(car.price);
		    System.out.println(car.isRunning);
    }
    
}

```

- we also can change variable in [main.java](http://main.java) files

```java
car.isRunning = false;
System.out.println(car.isRunning); //false
```

## We could also make methods in the Class, and use normally

- class.java:

```java
    void start(){
        boolean isRunning = true;
        System.out.println("You started the engine");
    }

    void stop(){
        boolean isRunning = false;
        System.out.println("You stopped the engine");
    }
```

- main.java

```java
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        
```
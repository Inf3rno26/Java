# Method inherited from the Object class.
Used to return a string representation of an object.
By default, it returns a hash code as a unique identifier.
It can be overridden to provide **meaningful details**.

For example - If we use sout(car) and tries to print car object directly, it will print Hash code of that, instead of that and getting something meaningful we use ToString method

- [Car.java](http://Car.java)

```java
package ToString;

public class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String ToString(){ //overriding

        return this.color + " " + this.year; //will sout in Main file
    }
}

```

- Main.java

```java
package ToString;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Mustang", 2025, "Red");

        System.out.println(car1); // we get same output as down

        System.out.println(car.color + " " + car.year);
    }
}

```
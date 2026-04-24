# Abstraction is the process of hiding implementation details and showing only the essential features.

## Abstract classes CAN'T be instantiated/Created directly
Can contain 'abstract' methods (which must be implemented)
Can contain 'concrete' methods (which are inherited)

- We declare “abstract” method in parent class so it doesnt make the object in parent class.
- Abstract methods in Parent class MUST be changed in the Children class and implemented for each children class.
- Concrete methods can be directly used by Children class as they are inherited.

- Shape.java (Parent class)

```java
// package Abstraction;

public abstract class Shape{

    abstract double area(); //method

    void display(){
        System.out.println("Concrete Method - and it will be inherited");
    } //concrete method
}
```

- Circle.java (Children)

```java
public class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return radius * radius  * 3.14;
    }
}

```

- Rectangle.java

```java
public class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area(){
        return 0.5 * length * breadth;
    }
}

```

- Main file

```java
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5.0, 6.0);

        circle.display();
        rectangle.display();
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}

```
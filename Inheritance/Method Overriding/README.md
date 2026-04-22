# When a subclass provides its own implementation of a method that is already defined.

Allows for code reusability and give specific implementations.

- We make Animal.java

```java
public class Animal{
    void move(){
        System.out.println("This animal is Running! ");
    }
}
```

- Dog.java (Children)

```java
public class Dog extends Animal{
    
}

```

- Cat.java

```java
public class Cat extends Animal{
    
}

```

- Fish.java

```java
public class Fish extends Animal{

    @Override
    void move(){
        System.out.println("This animal is Swimming!");
    }
}
```

- As output . Fish is moving is not appropriate we have to update/override the move method, and make it Swimming

## We have to use **“@Override”** keyword before updating the method
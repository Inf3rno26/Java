# A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.

Supports multiple inheritance-like behavior.

- With this, Classes can have multiple parents

- With Interfaces, YOU MUST define the methods in the inherited/implemented class.
- Keywords for Inheriting the class - “implement” 
- Declaring the Interface - “public interfaces”

- Interfaces - Predator and Prey

```java
public interface Prey {
    void flee();
}
```

```java
public interface Predator{

    void hunt(); // METHODS MUST BE DEFINED
}
```

- Children classes / Implemented Classes (Fish, Hawk, Rabbit)

As we Know Rabbit can only be hunted , so will use prey/flee method - which requires only 1 parent or on implementation

- Rabbit.java

```java
public class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("The rabbit fleed from the predator");
    }
}

```

As , Hawk hunts so we use only 1 implementation - Predator/Hunt

- Hawk.java

```java
public class Hawk implements Predator {
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting!");
    }
}

```

And, Fish can get both hunted, and can also prey , so we implement both 

- Fish.java

```java
public class Fish implements Prey , Predator{
    @Override
    public void hunt(){
        System.out.println("The fish is Hunting down!");
    }

    @Override
    public void flee(){
        System.out.println("The fish is swimming away!");
    }
}

```

## So, Interfaces are good for MAKING EXACT RULES which MUST be followed everywhere, in the children classes.
And also for multiple parents.
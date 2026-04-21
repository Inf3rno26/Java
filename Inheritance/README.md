# **Single level Inheritance**

# One class Inherits the attribute and methods from another class.

Parent → Child

The keywords for Joining classes is **“extends”**

- First we create a Animal class (Parent in this case)

```java
public class animal {

    boolean isAlive;

    animal() {
        isAlive = true;
    }

    void eat() {
        System.out.println("The animal is eating.");
    }
}
```

- Then we create some animals, - Dog and Cat (Childs in this case)
    - But we will make empty to check, that it inherits the attributes and methods of parent class or not.
    - Dog Class
    
    ```
    public class Dog extends animal{
        
    }
    ```
    
    - Cat class
    
    ```java
    public class Cat extends animal{
    }
    ```
    

- Now we make Main file to check

```java
public class main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println("The dog is alive: " + dog.isAlive);
        System.out.println("The cat is alive: " + cat.isAlive);

        dog.eat();
        cat.eat();
    }
}

```

---

## Each children classes can have their own Attributes and methods aswell.

- Dog class

```java
public class Dog extends animal{
    int lives = 1;

    void speak(){
        System.out.println("The dog is Barking!!! ");
    }
}
```

- Cat class

```java
public class Cat extends animal{

    // Children classes can have their own attributes and methods aswell!

    int lives = 9;
    
    void speak(){
        System.out.println("The cat is meowing!");
    }
}

```

- Main

```java
public class main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("The dog is alive: " + dog.isAlive);
        System.out.println("The cat is alive: " + cat.isAlive);
        System.out.println();
        
        dog.eat();
        dog.speak();
        
        System.out.println("Dog has " + dog.lives + " no. of lives.");
        
        System.out.println();
        System.out.println();
        
        cat.eat();
        cat.speak();
        System.out.println("Cat has " + cat.lives + " no. of lives.");
    }
}

```

- With this, it will implement Animal class attributes and also separates attire. also from their own classes.

---

---

---

# **Multilevel Inheritance**

Grandparent → Parent → Child

![image.png](attachment:9816558c-a17e-4efa-b814-46e8ec0fac63:image.png)

- We add Organism class , (grandparents in this case)

```java
public class Organism {
    boolean isAlive;

    Organism() {
        isAlive = true;
    }
}

```

- Animal will be parents and dog and cat will be children

```java
public class animal extends Organism {

    void eat() {
        System.out.println("The animal is eating.");
    }
}
```
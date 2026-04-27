# Runtime Polymorphism

**Runtime polymorphism** (also called **dynamic method dispatch**) is when the method that gets executed is decided **at runtime** based on the **actual type of the object**, not the reference type.

## When the method that gets executed is decided
at runtime based on the actual type of the object.

---

## Class Structure

```
Animal          ← abstract class (defines the contract)
├── Dog         ← concrete class (its own speak())
└── Cat         ← concrete class (its own speak())
```

```java
public abstract class Animal {
    abstract void speak();   // no body — subclasses MUST override this
}
```

> `Animal` can't be instantiated. It just guarantees that **every animal will have** a `speak()` method.
> 

---

## Overriding in Subclasses

```java
public class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog is Barking");   // Dog's version
    }
}

```

```java

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("The cat is meowing!");  // Cat's version
    }
}
```

Both classes **inherit** from `Animal` and **override** `speak()` with their own behavior.

---

## Runtime Decision in Main

```java
Animal animal;              // reference type = Animal (compile time)

if (choice == 1) {
    animal = new Dog();     // actual object = Dog
    animal.speak();         // → "The dog is Barking"
}
else if (choice == 2) {
    animal = new Cat();     // actual object = Cat
    animal.speak();         // → "The cat is meowing!"
}
```

> Java sees `animal.speak()` — the same line of code — but calls a **different method body** depending on what object is stored inside `animal` at that moment.
> 

---

## What happens step by step

```
User enters 1
    → animal = new Dog()         (Dog object created)
    → animal.speak() called      (Java checks: what is animal actually?)
    → actual type = Dog          (found at runtime)
    → Dog's speak() executes     → "The dog is Barking"
```

---

## 3 Requirements — Met in Your Code

| Requirement | How your code satisfies it |
| --- | --- |
| **Inheritance** | `Dog` and `Cat` both `extend Animal` |
| **Method Overriding** | Both use `@Override` on `speak()` |
| **Parent ref → Child object** | `Animal animal = new Dog() / new Cat()` |

---

## Key Takeaway

> `Animal` enforces the **what** (every animal must speak).
`Dog` and `Cat` each decide the **how** — and Java picks the right one only when the program is **actually running**.
> 

---

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("What Animal do you need? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            System.out.println("Invalid Choice!!!");
        }

        scanner.close();
    }
}

```
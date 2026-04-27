## **POLY** = Many · **MORPH** = Shape → *"Many forms"*

The core idea: **one reference type, many behaviours**. A `Vehicle` variable can *point to* a `Car`, `Bike`, or `Boat` — and when you call `go()`, each one does its own thing.

---

![image.png](attachment:00c985a1-89b3-4703-8971-cf3a2e540455:image.png)

### The three building blocks -

**1. Abstract superclass — `Vehicle`**
Declares *what* every vehicle must do, but not *how*.

```java
public abstract class Vehicle {
    abstract void go(); // contract — subclasses must implement this
}
```

`abstract` means you can't do `new Vehicle()` — it's just a blueprint.

---

**2. Concrete subclasses — Car, Bike, Boat**
Each *extends* `Vehicle` and *overrides* `go()` with its own behaviour.

```java
public class Car extends Vehicle {
    @Override
    void go() { System.out.println("You drive the car"); }
}
// Same pattern for Bike ("You ride the Bike") and Boat ("You sail the Boat")
```

`@Override` tells Java: "I'm intentionally replacing the parent's method."

---

**3. Polymorphic usage — `Main.java`**

```java
Vehicle[] vehicles = {car, bike, boat}; // all stored as Vehicle type

for (Vehicle vehicle : vehicles) {
    vehicle.go(); // Java picks the RIGHT go() at runtime
}
```

`vehicles` is typed as `Vehicle[]`, but it holds `Car`, `Bike`, `Boat` objects. Java looks at the **actual object** at runtime — not the declared type — to decide which `go()` to call. This is called **dynamic dispatch**.

---

### Why this matters

| Without Polymorphism | With Polymorphism |
| --- | --- |
| Separate loops / if-else for each type | One loop works for all types |
| Adding a new vehicle breaks existing code | Add a new class → loop works automatically |
| Tightly coupled, hard to extend | Open for extension, closed for modification |

---

### Key terms to remember

- **Superclass / Parent** — `Vehicle` (the common type)
- **Subclass / Child** — `Car`, `Bike`, `Boat` (specific types)
- **`extends`** — establishes the parent–child relationship
- **`abstract`** — declares a method that *must* be overridden
- **`@Override`** — confirms you're replacing a parent method
- **Upcasting** — storing a `Car` as a `Vehicle` reference (happens automatically)
- **Dynamic dispatch** — Java decides *which* `go()` to call at runtime, based on the actual object

---

### One-line memory hook

> *"A `Car` IS-A `Vehicle`. So anywhere a `Vehicle` is expected, a `Car` can fill in — but it brings its own behaviour."*
>
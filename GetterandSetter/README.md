# Getters & Setters — Java Notes

---

## What are they?

Methods that **protect object data** and add rules for accessing or modifying it. Fields are kept `private` so they can't be touched directly — getters and setters are the controlled gateway.

---

## The two types

**GETTER** → makes a field **readable**

- Starts with `get`, returns the field value
- Return type matches the field (or can be formatted, like `"$" + price`)
- No parameters

**SETTER** → makes a field **writeable**

- Starts with `set`, takes one parameter
- Always returns `void`
- Assigns the parameter to the field

## They help protect object data and add rules for accessing or modifying them.
 GETTERS = Methods that make a field READABLE.
 SETTERS = Methods that make a field WRITEABLE.

---

## Syntax

```java
// Getter
String getModel() {
    return this.model;
}

// Setter
void setColor(String color) {
    this.color = color;
}
```

---

## Why use them?

| Reason | Example |
| --- | --- |
| **Validation** | Reject negative prices inside `setPrice()` before assigning |
| **Read-only fields** | Provide a getter but no setter — field can't be changed after construction |
| **Custom formatting** | `getPrice()` returns `"$" + price` instead of the raw `int` |
| **Flexibility** | Change internal logic later without breaking external code |

---

## From your `Car` class

```java
// This fails — color is private
car.color = "Blue"; // ❌

// This works — using the setter
car.setColor("Blue"); // ✅
```

---

## Naming conventions

| Field type | Getter | Setter |
| --- | --- | --- |
| `String`, `int`, etc. | `getFieldName()` | `setFieldName(value)` |
| `boolean` | `isFieldName()` | `setFieldName(value)` |

---

- Car.java

```java
// package getterandsetters;

public class Car {
    private String model; // wont be changed
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getcolor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        this.price = price;
    }
}
```

- Main.java

```java
// package getterandsetters;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Yellow", 25000);

        // car.color = "Blue"; // this wont be changed as color is private

        car.setModel("Hyndai");
        car.setColor("Blue");
        car.setPrice(8000);

        System.out.println(car.getModel() + " " + car.getcolor() + " " + car.getPrice());
    }
}

```
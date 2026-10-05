# Java Programming

A structured collection of core Java fundamentals, Object-Oriented Programming (OOP) concepts, practice applications, and semester coursework.

---

## Repository Structure

### 1. Fundamentals
* **[Basic Java](./Basic%20Java/)** — Variables, data types, scope, user input, string operations, switches, varargs.
* **[Basic Modules](./Basic%20Modules/)** — Built-in utilities (`Math`, `Random`).
* **[conditions](./conditions/)** — Conditional statements and branching logic.
* **[Arrays](./Arrays/)** — 1D and 2D arrays, input parsing, search algorithms.
* **[Methods](./Methods/)** — Function definitions and method overloading.

### 2. Object-Oriented Programming (OOP)
* **[OOPs](./OOPs/)** — Classes, objects, and memory instantiation.
* **[Constructors](./Constructors/)** — Default, parameterized, and overloaded constructors.
* **[GetterandSetter](./GetterandSetter/)** — Data encapsulation and access control.
* **[Static Methods](./Static%20Methods/)** — Class-level variables (`static`) and utility methods.
* **[Inheritance](./Inheritance/)** — Base/derived classes, `super` keyword, method overriding, and `toString()`.
* **[Polymorphism](./Polymorphism/)** — Compile-time and runtime (dynamic method dispatch) polymorphism.
* **[Abstraction](./Abstraction/)** — Abstract classes, abstract methods, and contract enforcement.
* **[Interfaces](./Interfaces/)** — Interface contracts and multiple inheritance.

### 3. Practice & Projects
* **[practice](./practice/)** — Console-based utility programs:
  * Banking system (`banking.java`)
  * Interactive CLI quiz game (`quiztwo.java`)
  * Shopping cart checkout (`shopping_cart.java`)
  * Compound interest & weight converters
  * Slot machine simulation (`slot.java`)
* **[Mini Project](./Mini%20Project/)** — Auction bidding platform models (`Item`, `User`).
* **[Class assignment](./Class%20assignment/)** — College lab assignments and problem sets.

---

## Getting Started

### Prerequisites
* **Java Development Kit (JDK)**: Version 17+ (or JDK 21 / 25)

### Compile & Run
To compile and execute any individual program from the repository root:

```bash
# Compile a specific file
javac "practice/banking.java"

# Run the compiled bytecode
java -cp "practice" banking
```

For packages with multiple dependencies:
```bash
javac Abstraction/*.java
java -cp Abstraction Main
```

---

## Notes
Each major concept directory contains a companion `*_Notes.md` or `README.md` summarizing key syntax, rules, and best practices.

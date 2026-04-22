# A block of reusable codes that is executed when called ().

- The Variables passed in the Methods are called **Arguments**.
- “void” is the return type here. It can be any other datatype also.

```java
public class methods {
    public static void main(String[] args) {
        String name = "Vishad";
        int age = 18;

        happyBirthday(name, age);
        System.out.println("");
        happyBirthday(name, age);
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday! ");
        System.out.printf("Happy Birthday to %s! \n", name);
        System.out.printf("You are %d years old! \n", age);
    }
}

```

---

# Overloaded methods

- Methods that share the same name, but different parameters
    
    ```java
    public class overloaded_method {
        public static void main(String[] args) {
            System.out.println(add(1, 2, 3));
        }
    
        static double add(double a, double b) {
            return a + b;
        }
    
        static double add(double a, double b, double c) {
            return a + b + c;
        }
    }
    ```
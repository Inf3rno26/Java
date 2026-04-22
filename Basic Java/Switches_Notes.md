# New switches in Java

```java
public class switches {
    public static void main(String[] args) {
        int day = 1;

        switch (day) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            default -> System.out.println("Invalid Day");
        }
    }
}

```

- Also can be done like this

```java
public class switches {
    public static void main(String[] args) {
        int day = 1;

        switch (day) {
            case 1, 2, 3, 4, 5  -> System.out.println("Today is Weekday");
            case 6, 7 -> System.out.println("Today is Weeknds");
            default -> System.out.println("Invalid Day");
        }
    }
}

```
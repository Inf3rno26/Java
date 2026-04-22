# A collection of values of same data types.

# Array comes under Reference data type, so they aren’t printed directly.

Syntax:

```java
datatype[] name;

sout(name[index]);
```

```java
public class arrays {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "oranges"};

        System.out.println(fruits[1]);
    }
}

```

---

# Some additional properties:

1. Changing the value at certain index:

```java
fruits[1] = "watermelon";
```

1. Length of the Array:

```java
int numOfFruits = fruits.length; //3
```

1. Printing every member: Use for loop

```java
        for (int i=0; numOfFruits > i ; i++){
            System.out.println(fruits[i]);
        }
```

1. Enhanced for loop

```java
for(String fruit : fruits){
        System.out.println(fruit);
}
```

1. Sort the array

```java
import java.util.Arrays;

Arrays.sort(fruits);
```

1. Fill the array with single element everywhere

```java
Arrays.fill(fruits, "pineapple");
```

1. Equals method

```java
fruits[1].equals("watermelon");
```

---

# User inputs

- For arrays, we have to declare its length while **making the empty arra**y, only then we can use it.

```java
String[] foods = new String[5]; 
System.out.println(foods.length); //5
```

- declaring the inside value:

```java
String[] foods = new String[5]; 
foods[0] = "pizza";
foods[1] = "burger";
```

- Now mixed and all together

## Static user input array-

```java
import java.util.Scanner;

public class userinput_array {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String[] foods = new String[5];

        for(int i=0; i<foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
        
        for(String food : foods){
            System.out.println(food);
        }
        // System.out.println(foods.length);
        scanner.close();
    }
}

```

## Dynamically User input array

```java
public class userinput_array {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        String[] foods;

        System.out.print("Enter the # of Foods: ");
        size = scanner.nextInt();
        scanner.nextLine(); //for clearing input buffer

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
						System.out.print("Enter #" + (i+1) + " food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }
        // System.out.println(foods.length);
        scanner.close();

    }
}
```

---


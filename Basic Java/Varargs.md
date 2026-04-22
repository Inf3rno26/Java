# Allow a method to accept a varying numbers of arguments.

- Make method more flexible, no need for overloaded methods
- Java packs the arguments in the array
- invoked by adding this to the datatype in method - “…” (ellipsis)

## Example of addition method:

```java
public class varargs {
    public static void main(String[] args){
        System.out.println(add(2,2));

    }

    static int add(int... numbers){
        // System.out.println(numbers);

        int sum = 0;
        for(int number : numbers){  //because it maks the argument into array
            sum += number;
        }

        return sum;
    }
}

```

## Example of average method:

```java
public class varargs{
    public static void main(String[] args) {
        System.out.println(average(1,2));
    }

    static double average(double... numbers){
        double sum = 0;

        for (double number : numbers){
            sum += number;
        }

        return sum/numbers.length;

    }
}
```
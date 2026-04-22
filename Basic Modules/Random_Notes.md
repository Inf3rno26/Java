## We need Random class , from Util - ```java.util.Random```

```java
import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        int num;
        num = random.nextInt(1, 6); // Limits 
        System.out.println("Random Integer is: " + num );
    }
}

```

---

### for Doubles

```java
import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        double num;
        num = random.nextDouble(1, 6);
        System.out.println("Random Integer is: " + num );
    }
}
```

---

### For Booleans

```java
import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        boolean isHead;
        isHead = random.nextBoolean();
        System.out.println("Is it head: " + isHead);
    }
}

```
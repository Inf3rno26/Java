# For user inputs , we need to use/import Module “java.util.Scanner” or Scanner

<aside>
💡

Make sure to close the scanner in last

</aside>

## For String Input:

- “scanner.nextLine” - for Strings/Sentences most of the time
- “scanner.next” - for Character or single words .

```java
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
	      String name = Scanner.nextLine(); // for also containing spaces inside the name
					// String name = nameScanner.next(); // if you dont wanna consider spaces in the input
        System.out.println("Hello, Your name is " + name);

        nameScanner.close();

    }
}

```

---

## For Integer input:

We use **nextInt** for getting integer input.

```java
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You are this " + age + " Year old!");

        scanner.close();

    }
}

```

---

## For Double Input:

```java
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        
        System.out.println("Your GPA is: " + gpa);

        scanner.close();

    }
}

```

---

## For Boolean Input:

```java
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you Still Studying?: ");
        boolean isStudying = scanner.nextBoolean();

        System.out.println("Is he studying now?: "+ isStudying);

        scanner.close();

    }
}

```

---

# **FOR REMOVING INPUT BUFFER**

```java
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, Your name is " + name);
        System.out.println("You are this " + age + " Year old!");

        scanner.close();

    }
}

```
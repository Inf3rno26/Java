## Functions Done on,C

1. Length -

```java
String name = "Bro code";
int length = name.length();
```

1. CharAt - Gives the Letter at the index in a String

```java
String name = "Bro code";
char letter = name.charAt(0);
```

1. IndexOf - Gives the Index of the letter 

```java
String name = "Bro code";
int index = name.indexOf("o");
```

1. LastIndex - Gives from the last index of string

```java
String name = "Bro code";
int lastIndex = name.lastIndexOf("o");
```

1. UpperCase - Change every character to upper case

```java
String name = "Bro code";
name = name.toUpperCase();
```

1. Lower Case - Vice versa

```java
String name = "Bro code";
name = name.toLowerCase();
```

1. Eliminate Space characters

```java
String name = "        Bro Code               ";
name = name.trim();
```

1. Replace characters - Replace any character 

```java
String name = "Bro code";
name = name.replace("o", "a");
```

1. Checking String is Empty or not - this is a boolean function

```java
System.out.println(name.isEmpty()); //false
```

1.  Equals Method - Check the string with same characters

 - And to ignore lower case or upper case - name.equalsIgnoreCase();

```java
name.equals("Password"); //false
```

1. Contains - Check to see if string contains something

```java
name.contains("V");
```

1. isEmpty() - Checks to see if strings is empty

---

# Substring Methods

- A method used to extract a portion of a string [indexing].
    
    Syntax - 
    
    ```java
    string.substring(start,end);
    ```
    

- Example -

```java
public class string {
    public static void main(String[] args) {
        String email = "me@vishadjain.in";

        String username = email.substring(0,2);
        String at = email.substring(2,3);
        String domain = email.substring(3,16);

        System.out.println("Username: " + username);
        System.out.println("At: " + at);
        System.out.println("Domain: " + domain);

        System.out.println("Mail: " + email);

    }
}

```

- More flexible with the username length and all

```java
public class string {
    public static void main(String[] args) {
        String email = "Bro@vishadjain.in";

        String username = email.substring(0, email.indexOf("@"));
        String at = email.substring(email.indexOf("@") , email.indexOf("@") + 1);
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Username: " + username);
        System.out.println("At: " + at);
        System.out.println("Domain: " + domain);

        System.out.println("Mail: " + email);

    }
}
```
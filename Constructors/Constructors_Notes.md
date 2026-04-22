# A special method to initialize objects. You can pass arguments to a constructors and setup Initial values.

## Constructors are like making methods in the classes and making objects more dynamic

- class file

```java
public class student {
    String name;
    String name2;
    int age;
    double cgpa;
    boolean isEnrolled;

    student(String name,int age, double cgpa ){

        this.name = name; //name represents the above variable, and will be stored in that only
        this.age = age;
        this.cgpa = cgpa;
    }
}

```

- main.java

```java
public class studentExample {
    public static void main(String[] args) {
        student Student1 = new student("Vishad", 18 , 8.85);
        student Student2 = new student("Mihir", 18, 7.5);

        System.out.println(Student1.name);
        System.out.println(Student2.name);

        
    }
}

```

---

# Overloaded Constructors

- Allows a class to have multiple constructors with different parameters lists.
- Enables Object to be initialized in various ways.
- Class code:
    
    ```java
    public class User {
    
        String username;
        String email;
        int age;
    
        User(String username){
            this.username = username;
            this.email = "Not provided";
        }
        
        User(String username, String email){ //this is constructor overloading
            this.username = username;
            this.email = email; 
    
        }
    }
    ```
    

- Java file
    
    ```java
    public class Useres {
        public static void main(String[] args) {
            User user1 = new User("Vishad","meme"); //using 2nd method
    				User user1 = new User("Vishad"); //using 1st methods
            System.out.println("Username of 1st: " + user1.username);
            System.out.println("Username of 2nd: " + user1.email);
    
        }
    }
    
    ```
    

---

[student.java](attachment:ac988c87-cbdd-4e1a-b590-4292b666bd4c:student.java)

[studentExample.java](attachment:cd025329-1fb7-443c-8071-9f3dc6b394dc:studentExample.java)
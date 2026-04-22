# Refers to the parent class (superclass → subclass)
- Used in constructors and method overriding

**Calls the parent constructor to initialize attributes**

- Make the parent class  - Person.java

```java
public class Person {
    String firstName;
    String lastName;

    Person(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    void showName(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}

```

- Make the child class - Student.java

```java

public class Student extends Person {
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }
    
    void showGpa(){
        System.out.println(this.gpa);
    }
}

```

<aside>
💡

“super” keywords , represents call out the parent class construtor and fill the values in there, so it can be used as well

</aside>

- Make the main class - main.java

```java
public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Vishad", "Jain", 4.9);
        

        System.out.println(s1.firstName + " " + s1.lastName + " " + s1.gpa);
        s1.showName();
        s1.showGpa();

    }
}

```
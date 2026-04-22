# This is where Variables can be accessed.

## There are 2 types of Scopes -

1. Local 
2. Class

<aside>
💡

Local is first checked than class.

</aside>

---

# Local Scopes

- Present in the same brackets or same methods
    
    ```java
    public class variable_Scope {
        public static void main(String[] args){
            // local class
            int x = 10; 
            System.out.println(x);
    
            something();
        }
    
        static void something(){
    
            int x = 20; //again local
            System.out.println(x);
        }
    }
    
    ```
    

# Class scope

- Declared in the “main” method
    
    ```java
    public class variable_Scope {
        
        static int x = 5;
    
        public static void main(String[] args){
            // local class
            // int x = 10; 
            System.out.println(x); // will print 5 
    
            something();
        }
    
        static void something(){
    
            // int x = 20; //again local
            System.out.println(x); // will print 5
        }
    }
    
    ```
    

# Hierarchy check :

```java
public class variable_Scope {
    
    static int x = 5;

    public static void main(String[] args){
        // local class
        int x = 10; 
        System.out.println(x); //will print 10

        something();
    }

    static void something(){

        int x = 20; //again local
        System.out.println(x); //will print 20
    }
}

```

> LOCAL Scope > Class scope
>
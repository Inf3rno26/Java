# An array where each element is an array.

- Useful for storing a matrix of data.

```java
public class TwoDArray {
    public static void main(String[] args) {
        String [] fruits = {"apple", "orange", "mangoes"};
        String [] vegetable = {"potato", "tomato", "cabbage"}; 
        String [] misc = {"Sugar", "Rice", "Oil"};

        String[][] groceries = {fruits, vegetable, misc};

        for(String[] foods : groceries ){ 
            for(String food : foods){ //working with string here.
                System.out.print(food + " ");
            }
            System.out.println("");
        }
    }
}

```

- Alternative approch

```java
public class TwoDArray {
    public static void main(String[] args) {
        // String [] fruits = {"apple", "orange", "mangoes"};
        // String [] vegetable = {"potato", "tomato", "cabbage"}; 
        // String [] misc = {"Sugar", "Rice", "Oil"};

        String[][] groceries = {{"apple", "orange", "mangoes"}, 
                                {"potato", "tomato", "cabbage"},
                                {"Sugar", "Rice", "Oil"}};

        for(String[] foods : groceries ){
            for(String food : foods){ //working with string
                System.out.print(food + " ");
            }
            System.out.println("");
        }
    }
}

```

---

# Properties of 2D - Arrays

1. To Update a certain element

```java
groceries[0] //row [1] //column = "banana";
```

---

[TwoDArray.java](attachment:a4467b8b-1abd-43c5-9bc7-b7614ed4b2e5:TwoDArray.java)
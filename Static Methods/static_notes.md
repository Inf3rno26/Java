# Makes a variable or method belong to that class, rather than any specific object.
Commonly used for utility methods or shared resources.

```java
 public class friend {
    String name;
    static int numOfFriends; //static here makes it global, and 
				//belong to whole class if its not there count wont increase it for each object
    

    friend(String name){
        this.name = name;
        numOfFriends++;
        
    }

    public static void main(String[] args) {
        friend f1 = new friend("Vishad");
        friend f2 = new friend("Mihir");

        System.out.println(f1.numOfFriends);
        System.out.println(friend.numOfFriends);
    }
}

```

---

## Can also be used in Methods

```java
public class friend {
    String name;
    static int numOfFriends;

    friend(String name){
        this.name = name;
        numOfFriends++;
        
    }

    static void showFriend(){
        System.out.println("You have " + numOfFriends + " no of friends.");
    }

    public static void main(String[] args) {
        friend f1 = new friend("Vishad");
        friend f2 = new friend("Mihir");
        friend f3 = new friend("Jay");

        // System.out.println(friend.numOfFriends);
        friend.showFriend();
    }
}

```

---


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
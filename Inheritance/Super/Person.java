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

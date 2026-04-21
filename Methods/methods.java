public class methods {
    public static void main(String[] args) {
        String name = "Vishad";
        int age = 18;

        happyBirthday(name, age);
        System.out.println("");
        happyBirthday(name, age);
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday! ");
        System.out.printf("Happy Birthday to %s! \n", name);
        System.out.printf("You are %d years old! \n", age);
    }
}

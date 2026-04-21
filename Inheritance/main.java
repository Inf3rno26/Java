public class main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("The dog is alive: " + dog.isAlive);
        System.out.println("The cat is alive: " + cat.isAlive);
        System.out.println();
        
        dog.eat();
        dog.speak();
        
        System.out.println("Dog has " + dog.lives + " no. of lives.");
        
        System.out.println();
        System.out.println();
        
        cat.eat();
        cat.speak();
        System.out.println("Cat has " + cat.lives + " no. of lives.");
    }
}

public class Fish implements Prey , Predator{
    @Override
    public void hunt(){
        System.out.println("The fish is Hunting down!");
    }

    @Override
    public void flee(){
        System.out.println("The fish is swimming away!");
    }
}

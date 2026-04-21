public class variable_Scope {
    
    static int x = 5;

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

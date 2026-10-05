public class MySingleton{
    static MySingleton instance = null;

    int x = 10;
    private MySingleton() {};

    static public MySingleton getInstance(){
        if (instance == null){
            instance = new MySingleton();

        }
        return instance;
    }
}
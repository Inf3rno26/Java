public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5.0, 6.0);

        circle.display();
        rectangle.display();
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}

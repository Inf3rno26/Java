public class studentExample {
    public static void main(String[] args) {
        student Student1 = new student("Vishad", 18 , 8.85);
        student Student2 = new student("Mihir", 18, 7.5);
        student Student3 = new student("Jaywnt", 18, 5.55);

        System.out.println(Student1.name);
        System.out.println(Student2.name);
        System.out.println(Student3.name);

        Student1.study();
    }
}

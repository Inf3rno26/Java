public class student {
    String name2;
    // String name2;
    int age;
    double cgpa;
    boolean isEnrolled;

    student(String namee, int age, double cgpa) {

        this.name2 = namee;
        this.age = age;
        this.cgpa = cgpa;
    }

    void study() {
        System.out.println(this.name + "is Studying!");
    }
}

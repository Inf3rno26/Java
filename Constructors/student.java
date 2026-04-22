public class student {
    String name;
    String name2;
    int age;
    double cgpa;
    boolean isEnrolled;

    student(String name,int age, double cgpa ){

        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    void study(){
        System.out.println(this.name + " is Studying!");
    }
}

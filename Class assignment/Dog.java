class Employee {
    void calculateSalary() {
        System.out.println("Base Salary");
    }
}
class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Full Time Employee");
        System.out.println("Fixed Monthly Salary: 80000");
    }
}
class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Part Time Employee");
        System.out.println("Hourly Salary: 300/hr");
    }
    public static void main(String[] args) {
        Employee employees;
        employees = new FullTimeEmployee();
        employees.calculateSalary();
        System.out.println();
        employees = new PartTimeEmployee();
        employees.calculateSalary();
    }
}
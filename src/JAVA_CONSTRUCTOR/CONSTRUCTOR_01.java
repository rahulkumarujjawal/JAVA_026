package JAVA_CONSTRUCTOR;

// Employee class
class Employee {
    int id;
    String name;
    int age;
    String city;

    Employee(int id,String name,int age,String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
// Student class
class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

// Main class
public class CONSTRUCTOR_01 {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "RAHUL UJJAWAL", 22, "Bangalore");
        Student student = new Student(102, "RAHUL", 22);

        System.out.println(emp.name + "  " + emp.city);
        System.out.println(student.name + " " + student.age);
    }
}
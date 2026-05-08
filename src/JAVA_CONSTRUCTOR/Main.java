package JAVA_CONSTRUCTOR;
class Students{
    private int id;
    private String name;
    private int age ;

    Students(int id,String name,int age ){
        this.id = id;
        this.name = name;
        this.age = age;

    }
    void println(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
}
public class Main {
    public static void main(String[] args) {
   Students st = new Students(102,"rahul_ujjawal_sharma",22);
   st.println();
    }
}

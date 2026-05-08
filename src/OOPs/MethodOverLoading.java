package OOPs;
class Calculator {

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
       Calculator cal = new Calculator();
        int res1= cal.sum(10,20,30);
        int res2= cal.sum(10,20);
        int res3= cal.sum(20,30,40,50);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}

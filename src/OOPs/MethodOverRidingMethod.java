package OOPs;
class papa {
    int ploat = 200;
    public void details() {
        System.out.println("plot size " + ploat);
    }
}
class Ajay extends papa {
    public void pg() {
        System.out.println("full plate rice");
    }
    @Override
    public  void details(){
        System.out.println("plot + cafe");

    }
}
public class MethodOverRidingMethod {
    public static void main(String[] args) {
        Ajay aj = new Ajay();
        aj.pg();
        aj.details();

    }
}

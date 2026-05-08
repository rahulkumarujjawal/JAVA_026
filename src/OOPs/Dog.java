package OOPs;

class Animals {
    String name = "rahul";
    public void walk() {
        System.out.println("running......");
    }
}

class Dog extends Animals {
    public void sound() {
        System.out.println("bho bho");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();              // dog class ka object  we create
        dog.walk();
        dog.sound();
        System.out.println(dog.name);


    }
}
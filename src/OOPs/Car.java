package OOPs;

public class Car {

    // instance properties

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // now we are difine a method
    public void addFuel(Float fuel){
        currentFuelInLiters += fuel;

    }
    public  void drive(){
        System.out.println("Car is ");
    }

}

package vehicle;
public class Car extends Vehicle {
    private int numberOfDoors;

       public Car(String brand, int numberOfDoors) {
        super(brand); 
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void drivingMessage() {
        System.out.println("Driving a " + getBrand() + " with " + numberOfDoors + " doors is a smooth experience!");
    }
}

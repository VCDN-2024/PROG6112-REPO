package vehicle;
public class MainClass {
   public static void main(String[] args) {
     
        Car myCar = new Car("Toyota RXI", 4);

        System.out.println("Vehicle Brand: " + myCar.getBrand());
        myCar.displayFact();

        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Number of Doors: " + myCar.getNumberOfDoors());
        myCar.drivingMessage();

     
    }  
}

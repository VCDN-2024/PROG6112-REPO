package vehicle;
public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void displayFact() {
        System.out.println("Vehicles are cool");
    }
}



package abstractclasses;

abstract class Shape {
    // Abstract method - no implementation here
    public abstract double area();
    
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    public double area() {
        return Math.PI * radius * radius;// Why is radius twice?
    }
}

public class AbstractClasses {

    public static void main(String[] args) {
        // Cannot instantiate an abstract class directly
        // Shape shape = new Shape(); // This will result in an error
        
        // Create an instance of the concrete subclass
        Circle circle = new Circle(5.0);
        
        // Call methods from the abstract class and the subclass
        circle.display();
        System.out.println("Area of the circle: " + circle.area());
    }
    
}










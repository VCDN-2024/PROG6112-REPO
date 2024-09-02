
package abstractclasses;
// Step 1: Create a base class
class Shape2 {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Step 2: Create subclasses
class Circle2 extends Shape2 {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape2 {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}


public class NewClass {
         // Step 4: Create instances and call the overridden method
       public static void main(String[] args) {
        Shape2 circleShape = new Circle2();
        Shape2 squareShape = new Square();

        circleShape.draw(); // This will call the overridden draw method in Circle
        squareShape.draw(); // This will call the overridden draw method in Square
    }
}






package callingconstructor;

public class CallIngConstructor {

  
    public static void main(String[] args) {
      Dog myDog = new Dog("Canine", "Buddy");
        myDog.displayInfo();
    }
    
}
class Animal {//Superclass
    String species;
    Animal(String species) {
        this.species = species;
        System.out.println("Animal constructor called.");
    }
    
    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}
class Dog extends Animal {//Subclass
    String name;
    Dog(String species, String name) {
        super(species); 
        this.name = name;
        System.out.println("Dog constructor called.");
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        displaySpecies(); // Call method from the superclass
    }
}







package enumexample;

//Start of by defining your enum type
enum Day{
    Sunday("Weekend"),
    Monday("Weekday"),
    Tuesday("Weekday"),
    Wednesday("Weekday"),
    Thursday("Weekday"),
    Friday("Weekday"),
    Saturday("Weekend");
    
    private final String dayType;
//the variable dayType can  only be accessed in this class because of access modifier private
// the modifier final indicates that the variables value cannot be changed once it is assigned a value
//Once the variable is initialised, its value remains constant
//dayType is the name of the instance variable
//It is the identifier that will be used to refer to this variable within the class
    
    
//Setup the constructor
//Day is the name of the constructor which you will notice matches enum above.
//Constructors are used to initialise objects of a class or in this case enum when created
//String dayType is the parameter list of the constructor
    private Day(String dayType) {
        this.dayType = dayType;
    }
// the word "this" refers to the current instance of the class/enum
//Basically it is saying assign the value of dayType parameter to the dayType instance of the current enum instance

// Enum method
    public String getDayType() {//here you can see the access modifier is public
        return dayType;//getDayType() is the name of my method
        //the return will simply return the value of the dayType instance variable
    //so it will retrieve the dayType associated with each enu value.
}
    
}


public class EnumExample {

    public static void main(String[] args) {
         Day today = Day.Thursday;
        
        // Using enum constant
        System.out.println("Today is " + today);
        
        // Using enum method
        System.out.println("Today is a " + today.getDayType());
        
        // Iterating through enum values
        for (Day day : Day.values()) 
        {
            System.out.println(day + " is a " + day.getDayType());
        }
    }
    
}

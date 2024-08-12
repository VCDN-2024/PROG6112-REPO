
package classworkactivity;


public class ClassWorkActivity 
{

    public static void main(String[] args) {
     Superclass Message1= new Superclass();// Create your instance
      Superclass Message2= new Subclass();// Create your instance
      
      Message1.Display();//Superclass Output (Display Method)
      Message2.Display();//Subclass Output (Display Method)
      
     Message1.AnotherDisplay(); 
     
    }

}
     //Create our SuperClass
    class Superclass 
    {
        void Display()
        {
            System.out.println("Hi there, welcome to my Superclass");
        }
        
        void AnotherDisplay()
        {
          System.out.println("This is Another message to my Superclass");   
        }
        
    }
    
  class Subclass extends Superclass
    {@Override
            void Display()
        {
            System.out.println("Hi there, welcome to my Subclass");
        }
            
           void DisplayTwo()
           {
               super.AnotherDisplay();
                System.out.println("Subclass Method..");
           }
    }
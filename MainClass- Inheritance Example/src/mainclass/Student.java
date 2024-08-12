
package mainclass;

                    //Extends performs the inheritance
public class Student extends Person//Perform a clean and Build
{//Student is the Subclass/ Child Class
    private int StudentId;
    public Student (String name, int studentid)
    {
        super(name);//Super is used to call the constrcutor of the Parent(Person)
        this.StudentId=studentid;
    }
    public int getStudentId()
    {
        return StudentId;
    }
    public void Introduce()//Method for displaying details
    {//GetName()- is a method from the Parent class/Super Class (Person)
        System. out.println ("Hi, I am " + getName() + ".");
         System. out.println ("My Student number is " + StudentId + ".");
    }
    
    
}

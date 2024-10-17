package writeemployeefile;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;//specifies how to open a file

import java.util.Scanner;

public class WriteEmployeeFile {

 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
Path file = Paths.get("C:\\Users\\dengovender\\OneDrive - ADvTECH Ltd\\Desktop\\VC WORK 2024\\SEMESTER 2\\Programming 1B- PROG 6112\\Session 39-40\\WriteEmployeeFile\\Employees.txt");
// Creates a Path object named "file"

String s = "";
String delimiter = ",";
int id;
String name;
double payRate;
final int QUIT = 999;

try
{
OutputStream output = new
BufferedOutputStream(Files.newOutputStream(file, CREATE));
// creates an output stream for writing bytes to the file.

BufferedWriter writer = new
BufferedWriter(new OutputStreamWriter(output));
//initializes a buffered writer that will write text to the output stream.

System.out.print("Enter employee ID number >> ");
id = input.nextInt();

while(id != QUIT)//Will continue looping until id = QUIT(999)
{
System.out.print("Enter name for employee #" + id + " >> ");
input.nextLine();
name = input.nextLine();

System.out.print("Enter pay rate per hour >> ");
payRate = input.nextDouble();

s = id + delimiter + name + delimiter + payRate;
//creates a string with the employee information separated by the delimiter.

writer.write(s, 0, s.length());// writes the string to the file
writer.newLine();

System.out.print("Enter next ID number or " + QUIT + " to quit >> ");
id = input.nextInt();

}
writer.close();
}
catch(Exception e)
{

    System.out.println("Message: " + e);
}

}
}

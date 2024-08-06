package studentscores;
import java.util.Scanner;
public class StudentScores {
    public static void main(String[] args) {
// Define array to store student information (3 students and 3 subjects)
        String[][] studentData = new String[3][4]; 
// 3 students, 4 columns (name, math score, english score, science score)

Scanner scanner = new Scanner(System.in);

for (int i = 0; i < 3; i++) 
{
 System.out.println("Enter the name of student " + (i + 1) + ":");
 studentData[i][0] = scanner.nextLine();

 System.out.println("Enter the Math score for " + studentData[i][0] + ":");
 studentData[i][1] = scanner.nextLine();

 System.out.println("Enter the English score for " + studentData[i][0] + ":");
 studentData[i][2] = scanner.nextLine();

 System.out.println("Enter the Science score for " + studentData[i][0] + ":");
 studentData[i][3] = scanner.nextLine();
}

        // Display student information
        System.out.println("\nStudent Information:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + studentData[i][0]);
            System.out.println("Math Score: " + studentData[i][1]);
            System.out.println("English Score: " + studentData[i][2]);
            System.out.println("Science Score: " +  studentData[i][3]);
            System.out.println("-----------------------");
        }
         scanner.close();
    }
    
}

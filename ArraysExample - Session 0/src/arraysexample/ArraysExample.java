package arraysexample;
//import java.util.Arrays;    
    
public class ArraysExample {
 public static void main(String[] args) {
        //Declare your array and intialise
        int[] ExamScore = {55, 78, 80, 50, 65, 80};

//        int[] ExamScore;
//ExamScore = new int[]{55, 78, 80, 50, 65, 80};
        
//int[] ExamScore = new int[6]; // Declare an array of length 6
//ExamScore[0] = 55;
//ExamScore[1] = 78;
//ExamScore[2] = 80;
//ExamScore[3] = 50;
//ExamScore[4] = 65;
//ExamScore[5] = 80;

//int[] ExamScore = new int[6];
//int[] scores = {55, 78, 80, 50, 65, 80};
//for (int i = 0; i < ExamScore.length; i++) {
//    ExamScore[i] = scores[i];
//}

        //Calculate the average
        double Average = CalcAverageScore(ExamScore);
       
        //Display/Print exam scores
        System.out.println("There average scores:-->" + Average);

    }
 
 
    //Create your method for average
    public static double CalcAverageScore(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
        
   
    }
//public static double CalcAverageScore(int[] scores) {
//    int sum = 0;
    
//    for (int i = 0; i < scores.length; i++) {
//        sum += scores[i];
//    }
    
//    return (double) sum / scores.length;
//}
   
    
//    public static double CalcAverageScore(int[] scores) {
//    int sum = 0;
//    int i = 0;
//    while (i < scores.length) {
//        sum += scores[i];
//        i++;
//    }
//    return (double) sum / scores.length;
//}
}

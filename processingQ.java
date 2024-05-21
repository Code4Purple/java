import java.util.Scanner;

public class processingQ {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int biologyGrade;
		int englishGrade;
		int mathGrade;
        int numGrades;
        double avgGrade;

        biologyGrade = scnr.nextInt();
		englishGrade = scnr.nextInt();
		mathGrade = scnr.nextInt();
        numGrades = scnr.nextInt();
   
        //numGrades *=1.0;
        avgGrade = ((mathGrade + englishGrade + biologyGrade) / (double)(numGrades));

        System.out.println(avgGrade);
    }
}
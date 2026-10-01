import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] subjectMarks = new int[5];
        int totalMarks = 0;

        for (int subjectIndex = 0; subjectIndex < 5; subjectIndex++) {
            System.out.print("Enter marks for subject " + (subjectIndex + 1) + " (out of 100): ");
            subjectMarks[subjectIndex] = keyboard.nextInt();
            totalMarks += subjectMarks[subjectIndex];
        }

        // Type casting int to double so the division is not truncated
        double percentageScored = (double) totalMarks / 5;

        String studentGrade;
        if (percentageScored >= 90) {
            studentGrade = "A+";
        } else if (percentageScored >= 80) {
            studentGrade = "A";
        } else if (percentageScored >= 70) {
            studentGrade = "B";
        } else if (percentageScored >= 60) {
            studentGrade = "C";
        } else if (percentageScored >= 40) {
            studentGrade = "D";
        } else {
            studentGrade = "F (Fail)";
        }

        System.out.println("Total Marks   : " + totalMarks + " / 500");
        System.out.printf("Percentage    : %.2f%%\n", percentageScored);
        System.out.println("Grade         : " + studentGrade);

        keyboard.close();
    }
}
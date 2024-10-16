package threebythree;
import java.util.Scanner;
public class Iyanu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students b/w 1 -3: ");
        int numStudents = input.nextInt();
        int score, lastScore, secondToLastScore;
        String name = ""; String lastName = "";String secondToLastName = "";


        System.out.println("Enter student name: ");
        name = input.next();
        System.out.println("Enter student score: ");
        score = input.nextInt();
        lastScore = score;
        lastName = name;
        secondToLastName = name;
        secondToLastScore = Integer.MAX_VALUE;
        while (numStudents > 1) {
            System.out.println("Enter student name: ");
            name = input.next();
            System.out.println("Enter student score: ");
            score = input.nextInt();
            if (score < lastScore ) {
                secondToLastScore = lastScore;
                secondToLastName = lastName;
                lastScore = score;
                lastName = name;
            } else if (score < secondToLastScore) {
                secondToLastScore = score;
                secondToLastName = name;
            }

            numStudents--;
        }
        System.out.println("The Student with the lowest score is: " +lastName + " With the score of " + lastScore);
        System.out.println("The Student with the second lowest score is: " +secondToLastName + " With the score of " + secondToLastScore);

    }
}

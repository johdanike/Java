import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for(int index = number; index > 0; index--) {
            factorial *= index;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}

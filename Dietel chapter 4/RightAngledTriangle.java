import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter lenght of the base of trangle: ");
        int base = input.nextInt();

        for(int rows = 1; rows <= base; rows++){
            for(int col =1; col <= rows; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

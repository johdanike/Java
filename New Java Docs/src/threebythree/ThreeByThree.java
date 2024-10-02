package threebythree;

import java.util.Arrays;
import java.util.Scanner;
public class ThreeByThree {
    static Scanner input = new Scanner(System.in);
    static int rows, cols;
    public ThreeByThree(int rows, int cols) {
        ThreeByThree.rows = rows;
        ThreeByThree.cols = cols;
    }

    public static void main(String[] args) {
        System.out.println("How many rows?");
        rows = Integer.parseInt(input.next());
        System.out.println("How many columns?");
        cols = Integer.parseInt(input.next());
//        System.out.print(Arrays.deepToString(new String[]{display(rows, cols)}));
        System.out.println(display(rows, cols));
    }

    public static String display(int rows, int cols) {
        String [][] newArray = new String[rows][cols];
        String pattern = "";
        for(int index = 0; index < newArray.length; index++) {
            System.out.println("Enter '1' - '*' or '0' for spaces ");
            for(int col = 0; col < newArray[index].length; col++) {
                newArray[index][col] = input.next();
                if(newArray[index][col].equals("1")) {
//                    newArray[index][col] = "*";
                    pattern += "* ";
                }
                else if(newArray[index][col].equals("0")) {
//                    newArray[index][col] = " ";
                    pattern += "  ";
                }
            }
            pattern += "\n";
        }

        return pattern;
    }

}

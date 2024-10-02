package threebythree;

import java.util.Scanner;

public class ThreeByThreeTask {
    static Scanner input = new Scanner(System.in);


    public static String[][] display(int row, int col) {
       return new String[row][col];
    }
    static int setRows(){
        System.out.println("Enter the number of rows: ");
        int value = input.nextInt();
        return value;
    }

    private static int setCols(){
        System.out.println("Enter the number of columns: ");
        int value = input.nextInt();
        return value;
    }

    public static void fillArray(String[][] array){
        String pattern = "";
        for(int index = 0; index < array.length; index++) {
            System.out.println("Enter '1' - '*' or '0' for spaces ");
            for(int col = 0; col < array[index].length; col++) {
                array[index][col] = String.valueOf(Integer.parseInt(input.next()));
                if(array[index][col].equals('1')) {
//                    newArray[index][col] = "*";
                    pattern += "*";
                }
                else {
//                    newArray[index][col] = " ";
                    pattern += " ";
                }
            }
            pattern += "\n";
        }
        System.out.print(pattern);
        System.out.println();
    }

    public static void main(String[] args) {
        int row, col;
        row = setRows();
        col = setCols();
        fillArray(display(row, col));
    }
}

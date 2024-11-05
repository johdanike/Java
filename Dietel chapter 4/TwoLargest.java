import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int secondLargest = 0;

        for(int index =1; index <= 10; index++){
            System.out.printf("Enter number %d: ", index);
            int number = input.nextInt();

            if(number > largest){
                largest = number;
            }
            if(number < largest && largest > secondLargest ){
                secondLargest = number;
            }
        }
        System.out.printf("The largest number is %d%n", largest);
        System.out.printf("The second largest number is %d", secondLargest);


    }
}

import java.util.*;

public class LetterGradeToNumber{
  public static void main(String [] args){
    
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Letter Grade: ");
  String entry = input.nextLine().toUpperCase();


  if(entry.equals("A")){
    System.out.printf("The score for %s%n is 4", entry);

  }else if(entry.equals("B")){
    System.out.printf("The score for %s%n is 3", entry);

  }else if(entry.equals("C")){
    System.out.printf("The score for %s%n is 2", entry);

  }else if(entry.equals("D")){
    System.out.printf("The score for %s%n is 1", entry);

  }else if(entry.equals("F")){
    System.out.printf("The score for %s%n is 0", entry);

  }else{System.out.print("Invalid Grade entered - " + entry);}

  }
}
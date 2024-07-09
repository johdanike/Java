import java.util.*;

public class LargestAndSmallestInt{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter first integer: ");
  int userEnt1 = input.nextInt();

  System.out.print("Enter second integer: ");
  int userEnt2 = input.nextInt();

  System.out.print("Enter third integer: ");
  int userEnt3 = input.nextInt();

  System.out.print("Enter fourth integer: ");
  int userEnt4 = input.nextInt();

  System.out.print("Enter fifth integer: ");
  int userEnt5 = input.nextInt();

 

  if(userEnt1 > userEnt2 && userEnt1 > userEnt3 && userEnt1 > userEnt4 && userEnt1 > userEnt5){
    System.out.printf("%d is greater %n ", userEnt1);
  }else if (userEnt2 > userEnt1 && userEnt2 > userEnt3 && userEnt2 > userEnt4 && userEnt2 > userEnt5){
    System.out.printf("%d is greater %n", userEnt2);    
  }else if (userEnt3 > userEnt1 && userEnt3 > userEnt2 && userEnt3 > userEnt4 && userEnt3 > userEnt5){
    System.out.printf("%d is greater %n", userEnt3);  
  }else if (userEnt4 > userEnt1 && userEnt4 > userEnt2 && userEnt4 > userEnt1 && userEnt4 > userEnt3){
    System.out.printf("%d is greater %n", userEnt4);  
  }else if (userEnt5 > userEnt1 && userEnt5 > userEnt2 && userEnt5 > userEnt3 && userEnt5 > userEnt4){
    System.out.printf("%d is greater %n", userEnt5);  
  }else{System.out.printf("All are equal"); }

  if(userEnt1 < userEnt2 && userEnt1 < userEnt3 && userEnt1 < userEnt4 && userEnt1 < userEnt5){
    System.out.printf("%d is lesser", userEnt1);
  }else if (userEnt2 < userEnt1 && userEnt2 < userEnt3 && userEnt2 < userEnt4 && userEnt2 < userEnt5){
    System.out.printf("%d is lesser", userEnt2);    
  }else if (userEnt3 < userEnt1 && userEnt3 < userEnt2 && userEnt3 < userEnt4 && userEnt3 < userEnt5){
    System.out.printf("%d is lesser", userEnt3);  
  }else if (userEnt4 < userEnt1 && userEnt4 < userEnt2 && userEnt4 < userEnt1 && userEnt4 < userEnt3){
    System.out.printf("%d is lesser", userEnt4);  
  }else if (userEnt5 < userEnt1 && userEnt5 < userEnt2 && userEnt5 < userEnt3 && userEnt5 < userEnt4){
    System.out.printf("%d is lesser", userEnt5);  
  }else{System.out.printf("All are equal"); }


  }
}
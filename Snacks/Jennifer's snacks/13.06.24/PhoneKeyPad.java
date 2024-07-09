import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class PhoneKeyPad{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter letter: ");
	String letter = input.nextLine();

	char key = letter.charAt(0);
	key = Character.toUpperCase(key);
	
	if(key=='A'||key=='B'|| key=='C'){
		System.out.println("2");
	}else if(key=='D'||key=='E'|| key=='F'){
		System.out.println("3");
	}else if(key=='G'||key=='H'|| key=='I'){
		System.out.println("4");
	}else if(key=='J'||key=='K'|| key=='L'){
		System.out.println("5");
	}else if(key=='M'||key=='N'|| key=='O'){
		System.out.println("6");
	}else if(key=='P'||key=='Q'|| key=='R'){
		System.out.println("7");
	}else if(key=='S'||key=='T'|| key=='U'){
		System.out.println("8");
	}else if(key=='V'||key=='W'|| key=='X'){
		System.out.println("9");
	}else if(key=='Y'||key=='Z'){
		System.out.println("0");
	}else{
		System.out.println("Invalid Input");

	}
	
   }
}
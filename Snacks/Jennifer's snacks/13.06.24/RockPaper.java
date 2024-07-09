import java.util.Scanner;
import java.util.Random;

public class RockPaper{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);


		
		int scissor = 0;

		int rock = 1;

		int paper = 2;
	
		System.out.printf("Scissor (%d), rock (%d), paper (%d): ", scissor, rock, paper);		
		int userSel = input.nextInt();

		Random rand = new Random();
		int computerSel = rand.nextInt(3) + 1;
			
		if(computerSel == userSel){
			System.out.printf("The computer is %d, You also are %d. It is a draw", computerSel, userSel);

		}else if(computerSel == scissor && userSel == 1){
			System.out.print("The computer is scissor, You are rock. You won!");

		}else if(userSel == scissor && computerSel == 1){
			System.out.print("You are scissor, The computer is rock. The Computer won!");

		}else if(computerSel == paper && userSel == 1){
			System.out.print("The computer is Paper, You are rock. The computer won!");

		}else if(userSel == paper && computerSel == 1){
			System.out.print("The computer is rock, You are paper. You won!");

		}else if(userSel == scissor && computerSel == 2){
			System.out.print("The computer is paper, You are scissor. You won!");

		}else if(computerSel == scissor && userSel == 2){
			System.out.print("The computer is scissor, You are paper. The computer won!");
		}

		else{
			System.out.print("Invalid input");

		}

	
		

	}	
}
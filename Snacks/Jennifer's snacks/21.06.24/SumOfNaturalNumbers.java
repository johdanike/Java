import java.util.Scanner;  //PASSED

public class SumOfNaturalNumbers{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	int integer1 = 0; int integer2 = 0; int integer3 = 0; int integer4 = 0; int integer5 = 0; int integer6 = 0; int integer7 = 0; int integer8 = 0; int integer9 = 0; int integer10 = 0;
	int in = 1;
	int sum = 0;


		for(int num = 1; num <= 10; num++){
			System.out.printf("Enter (%d) integers: ", num);
			in = input.nextInt();

		if(num==1)integer1=in;
		if(num==2)integer2=in;
		if(num==3)integer3=in;
		if(num==4)integer4=in;
		if(num==5)integer5=in;
		if(num==6)integer6=in;
		if(num==7)integer7=in;
		if(num==8)integer8=in;
		if(num==9)integer9=in;
		if(num==10)integer10=in;
			
			sum = integer1 + integer2 + integer3 + integer4 + integer5 + integer6 + integer7 + integer8 + integer9 + integer10;
		}
			System.out.printf("The total of all integers is %d%n", sum);

	}
}
import java.util.Scanner; //2.18  PASSED

public class FloatingPointToInteger{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int a = 0;
	int b =0;

	System.out.println("a\t b\t pow(a, b)");

   		for (a = 1; a <= 5; a++){
			
     			b = a + 1;
			
     			float pow = (float)Math.pow(a, b);

     			System.out.printf("%n%d\t %d\t %.0f",a,b, pow); 
     		} 

	}
}
public class Pattern2{
	public static void main(String[]args){
	
	System.out.println("PATTERNS 1");
		int row = 6;
		for(int first = 1; first <= row; first++){
			for(int col =1; col <= first; col++){
				System.out.print("* ");
			}
			System.out.println();
		}

		

	System.out.println("PATTERNS 2");
		for(int second = 1; second <= row; second++){
			for(int col = second; col <= row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}


	System.out.println("PATTERNS 3");
		for(int third = 1; third <=row; third++){
			for(int spaces = third; spaces <= row; spaces++){
				System.out.print("  ");
			}
			for(int col = 1; col <= third; col++){
				System.out.print("* ");
			}
			System.out.println();
		}

System.out.println("PATTERNS 4");
		for(int four = 1; four <=row; four++){
			for(int spaces = 1; spaces <= four; spaces++){
				System.out.print("  ");
			}
			for(int col=four; col <= row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
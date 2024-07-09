public class Patterns{
	public static void main(String[]args){

	for(int firstPattern = 1; firstPattern <= 6; firstPattern++){
			for(int column =1; column < firstPattern; column++){
				System.out.print("* ");
			}
                      System.out.println();
			
		}
            


	
		for(int row = 0; row <= 6; row++){



	
		for(int firstPattern = 0; firstPattern <= row; firstPattern++){
			for(int column =0; column < firstPattern; column++){
				System.out.print("* ");
			}
			
		}

		

	for(int space = 1; space < 5; space++){
              System.out.print("  ");   
              }


		for(int secondPattern = 1; secondPattern <= row; secondPattern++){
			for(int column = secondPattern; column <= row; column++){
				System.out.print("*");
			}
			
		}


/*	for(int space2 = 1; space2 < 5; space2++){
		System.out.print(" ");
	}

		for(int thirdPattern = 1; thirdPattern <=row; thirdPattern++){
			for(int spaces = thirdPattern; spaces <= row; spaces++){
				System.out.print("  ");
			}
			for(int column = 1; column <= thirdPattern; column++){
				System.out.print("*");
			}
			
		}

	for(int space3 = 1; space3 < 5; space3++){
		System.out.print(" ");
	}

		for(int fourthPattern = 1; fourthPattern <=row; fourthPattern++){
			for(int spaces = 1; spaces <= fourthPattern; spaces++){
				System.out.print("  ");
			}
			for(int column=fourthPattern; column <= row; column++){
				System.out.print("*");
			}
		
		} **/
             
		System.out.println();
	

		}

	}
}
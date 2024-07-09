import java.util.Scanner;

public class BriggsMeyers{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		
		System.out.println("MYERS BRIGGS QUESTIONAIRE");
		System.out.println("\nThis free personality tet reveals who youbreally are. Discover the 16 personalities created by Myers and Briggs, test your personality type, and find your strengths.");

		System.out.println("\nWhat is your name?");
		String name = input.next();

		System.out.println("\nFROM EACH PAIR, CHOOSE THE PHRASE THAT DESCRIBES YOU BEST.");

		String num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20 = "";


		String firstOption = """
			  No. 1:   	A: Expend energy, enjoy groups				B: Conserve energy, enjoy one-on-one 
			   							""";
				System.out.println(firstOption);	
 				num1 = input.next();

		String secondOption = """
			  No. 2:		A: Interpret literally					B: Look for meaning and possibilities
			   								""";
				System.out.println(secondOption);	
 				num2 = input.next();

		String thirdOption = """
			  No. 3:		A: Logical, thinking, questioning			B: emphatic, feeling, accomodating
			   								""";
				System.out.println(thirdOption);	
 				num3 = input.next();
		String fourthOption = """
			  No. 4:		A: Organised, orderly					B: Flexible, adaptable
			   								""";
				System.out.println(fourththOption);				   								
 				num4 = input.next();
		String fifthOption = """
			  No. 5: 		A: More outgoing, think out loud				B: More reserved, think to yourself 
			   								""";
				System.out.println(fifthOption);				   								
 				num5 = input.next();
		String sixthOption = """
			  No. 6:		A: Practical, realistic, experimental			B: Imaginative, innovative, theoritical
			   								""";
				System.out.println(sixthOption);				   								
 				num6 = input.next();
		String seventhOption = """
			  No. 7: 		A: Candid, staight forward, frank				B: tactful, kind, encouraging 
			   								""";
				System.out.println(seventhOption);	
 				num7 = input.next();
		String eightOption = """
			  No. 8:		A: Plan, schedule 					B: Unplanned, spontaneous 
				System.out.println(eightOption);	
 				num8 = input.next();
		String ninthOption = """
			  No. 9: 		A: Seek many tasks, public activities, interaction with others				B: Seek private, solitary activities with quiet to concentrate
				System.out.println(ninthOption);				   								""";
 				num9 = input.next();
		String tenthOption = """
			  No. 10:		A: Standard, usual, conventional 				B: Different, novel, unique
																	""";
				System.out.println(tenthOption);				   								
 				num10 = input.next(); 
		String elevenOption = """
			  No. 11:   	A: FIrm, tend to criticize, hold the line				B: GEntle, tend to appreciate, conciliate
			   							""";
				System.out.println(elevenOption);	
 				num11 = input.next();

		String twelveOption = """
			  No. 12:		A: Regulated, structured				B: Easygoing, "live" and "let live"
			   								""";
				System.out.println(twelveOption);	
 				num12 = input.next();

		String thirteenOption = """
			  No. 13:		A: External, commnuicative, express yourselve			B: internal, reticent, keep to ypurself
			   								""";
				System.out.println(thirteenOption);	
 				num13 = input.next();
		String fourteenOption = """
			  No. 14:		A: Organised, orderly					B: Flexible, adaptable
			   								""";
				System.out.println(fourteenOption);				   								
 				num14 = input.next();
		String fifteeenOption = """
			  No. 15: 		A: Tough-minede, just				B: tender-hearted, merciful
			   								""";
				System.out.println(fifteenOption);				   								
 				num15 = input.next();
		String sixteenOption = """
			  No. 16:		A: Preparation, plan-ahead			B: Go with the flow, adapt as you go
			   								""";
				System.out.println(sixteenOption);				   								
 				num16 = input.next();
		String seventeenOption = """
			  No. 17: 		A: Active, initiate				B: reflective, deliberate 
			   								""";
				System.out.println(seventeenOption);				   								
 				num17 = input.next();
		String eighteenOption = """
			  No. 18:		A: Facts, things, "what-is" 			B: Reflective, deliberate
			   								""";
				System.out.println(eighteenOption);				   								
 				num18 = input.next();
		String ninteenOption = """
			  No. 19: 		A: Matter of facts, issue oriented				B: Sensitive, people oriented, compassionate
			   								""";
				System.out.println(nineteenOption);				   								
 				num19 = input.next(ninthOption);
		String twentyOption = """
			  No. 20:		A: Control, govern				B: Latitude, freedom
			   								""";
				System.out.println(twentyOption);				   								
 				num20 = input.next(); 

		string groupA = num1 + num5 + num9 + num13 + num17;
		string groupB = num2 + num6 + num10 + num14 + num18;
		string groupC = num3 + num7 + num11 + num15 + num19;
		string groupD = num4 + num8 + num12 + num16 + num20;
		
		if(num1 == A){ 
			
		}				
		

	}
}
import java.util.Scanner;

public class MBTI{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		System.out.println("MYERS BRIGGS QUESTIONAIRE");
		System.out.println("\nThis free personality tet reveals who youbreally are. Discover the 16 personalities created by Myers and Briggs, test your personality type, and find your strengths.");


		response(); 
		ExtrovertIntrovert(response());
		SensingIntuitive(response());
		//ThinkingFeeling(response());
		//JudgingPerceptive(response());
		//SummaryField();

	}

	private static String setName(String name){
		Scanner input = new Scanner(System.in);
		System.out.println("\nWhat is your name?");
		name = input.next();
		return name;
	}

	public static String [] category(){
		String [] questions = {
			"1: A: Expend energy, enjoy groups	B: Conserve energy, enjoy one-on-one",
			"2: A: Interpret literally		B: Look for meaning and possibilities",
			"3: A: Logical, thinking, questioning	B: emphatic, feeling, accomodating",
			"4: A: Organised, orderly		B: Flexible, adaptable",
			"5: A: More outgoing, think out loud	B: More reserved, think to yourself",
			"6: A: Practical, realistic, experimental	B: Imaginative, innovative, theoritical",
			"7: A: Candid, staight forward, frank	B: tactful, kind, encouraging",
			"8: A: Plan, schedule 			B: Unplanned, spontaneous",
			"9: A: Seek many tasks, public activities, interaction with others	B: Seek private, solitary activities with quiet to concentrate",
			"10: A: Standard, usual, conventional	B: Different, novel, unique",
			"11: A: FIrm, tend to criticize, hold the line	B: GEntle, tend to appreciate, conciliate",
			"12: A: Regulated, structured	B: Easygoing, 'live' and 'let live'",
			"13: A: External, commnuicative, express yourselve	B: internal, reticent, keep to ypurself",
			"14: A: Organised, orderly	B: Flexible, adaptable",
			"15: A: Tough-minede, just	B: tender-hearted, merciful",
			"16: A: Preparation, plan-ahead		B: Go with the flow, adapt as you go",
			"17: A: Active, initiate	B: reflective, deliberate",
			"18: A: Facts, things, 'what-is'	B: ideas, dreams, 'What could be', Philosophical",
			"19: A: Matter of facts, issue oriented	B: Sensitive, people oriented, compassionate",
			"20: A: Control, govern	B: Latitude, freedom"
		};
		return questions;
	}

	public static String[] response(){
	Scanner input = new Scanner(System.in);
		String [] answer = new String [20];
		String[] questions = category();
		for(int index = 0; index < questions.length; index++){

			System.out.println(questions[index]);			
			System.out.println("Enter choice: ");
			String choice = input.next();
			answer[index] = choice;
			if(!answer[index].equalsIgnoreCase("a") && !answer[index].equalsIgnoreCase("b")){
				throw new IllegalArgumentException("Invalid entry");
				// response();
			}
		}
		return answer;
	}

	public static String ExtrovertIntrovert(String [] response){
		int countFirstA = 0;
		int countFirstB = 0;
		String first = response[0];
		String second = response[4];
		String third = response[8];
		String fourth = response[12];
		String fifth = response[16];
		
		for(int index = 0; index < response.length; index++){
			if(first.charAt(index) == ('A') || second.charAt(index) == ('A') || third.charAt(index) == ('A') || fourth.charAt(index) == ('A') || fifth.charAt(index) == ('A')){
				countFirstA++;
			}
			else if(first.charAt(index) == ('B') || second.charAt(index) == ('B') || third.charAt(index) == ('B') || fourth.charAt(index) == ('B') || fifth.charAt(index) == ('B')){
				countFirstB++;
			}
		}
			if(countFirstA > countFirstB)return "E";
			else return "I";	
	} 


	public static String SensingIntuitive(String [] response){
		int countSecondA = 0;
		int countSecondB = 0;
		String first = response[1];
		String second = response[5];
		String third = response[9];
		String fourth = response[13];
		String fifth = response[17];
		
		for(int index = 0; index < response.length; index++){
			if(first.charAt(index) == ('A') || second.charAt(index) == ('A') || third.charAt(index) == ('A') || fourth.charAt(index) == ('A') || fifth.charAt(index) == ('A')){
				countSecondA++;
			}
			else if(first.charAt(index) == ('B') || second.charAt(index) == ('B') || third.charAt(index) == ('B') || fourth.charAt(index) == ('B') || fifth.charAt(index) == ('B')){
				countSecondB++;
			}
		}
			if(countSecondA > countSecondB)return "S";
			else return "N";	
	} 



	public static String ThinkingFeeling(String [] response){
		int countThirdA = 0;
		int countThirdB = 0;
		String first = response[2];
		String second = response[6];
		String third = response[10];
		String fourth = response[14];
		String fifth = response[18];
		for(int index = 0; index < response.length; index++){
			if(first.charAt(index) == ('A') || second.charAt(index) == ('A') || third.charAt(index) == ('A') || fourth.charAt(index) == ('A') || fifth.charAt(index) == ('A')){
				countThirdA++;
			}
			else if(first.charAt(index) == ('B') || second.charAt(index) == ('B') || third.charAt(index) == ('B') || fourth.charAt(index) == ('B') || fifth.charAt(index) == ('B')){
				countThirdB++;
			}
		}
			if(countThirdA > countThirdB)return "T";
			else return "F";	
	} 


	public static String JudgingPerceptive(String [] response){
		int countFourthA = 0;
		int countFourthB = 0;
		String first = response[3];
		String second = response[7];
		String third = response[11];
		String fourth = response[15];
		String fifth = response[19];
		for(int index = 0; index < response.length; index++){
			if(first.charAt(index) == ('A') || second.charAt(index) == ('A') || third.charAt(index) == ('A') || fourth.charAt(index) == ('A') || fifth.charAt(index) == ('A')){
				countFourthA++;
			}
			else if(first.charAt(index) == ('B') || second.charAt(index) == ('B') || third.charAt(index) == ('B') || fourth.charAt(index) == ('B') || fifth.charAt(index) == ('B')){			
				countFourthB++;
			}
		}
			if(countFourthA > countFourthB)return "J";
			else return "P";
	} 

	/**public static String SummaryField(String summary){
		MBTI mainNew = new MBTI();
		String name = setName(summary);
		String[] answer = response();
		for(int index = 0; index < answer.length; index++){
			System.out.printf("Hello %s %nYou selected: %n%s%nNumber of A selected: %nNumber of B selected: ",name,index );
			System.out.println();
			final[index] = 
		}

		String.concate();


		return final;
	}

	**/


}
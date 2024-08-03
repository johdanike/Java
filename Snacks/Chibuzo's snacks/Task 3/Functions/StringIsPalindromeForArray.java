import java.util.Arrays;
public class StringIsPalindromeForArray{
	public static void main(String[]args){
		//StringIsPalindromeForArray stringPalindrome = new StringIsPalindromeForArray();
		String [] word = {"racecar"};
		String [] result = reverseString("word");
		System.out.print(result);
	}



	public static String reverseString(String string){
		int counter = 0;
		String reversed [] = new String [string.length];
		for(int reverse = string.length - 1; reverse >= 0 ; reverse--){
			reversed[counter] = string[counter];
			counter ++;
		}
		if(Arrays.toString(reversed).equals(Arrays.toString(string)))return "Is A Palindrome";
		else return "Is Not A Palindrome";
	}
}


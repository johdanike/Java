import java.util.Arrays;
public class StringIsPalindrome{
	public static void main(String[]args){
		StringIsPalindrome stringPalindrome = new StringIsPalindrome();
		String word = "racecar";
		String result = StringIsPalindrome.reverseString(word);
		System.out.printf(result);
	}


	public static String reverseString(String string){
		String reversed = "";
		for(int reverse = string.length() - 1; reverse >= 0 ; reverse--){
			reversed += string.charAt(reverse);
		}
		if(reversed.equals(string)){
return "Is A Palindrome";}
		else {return "Is Not A Palindrome";}
	}
}



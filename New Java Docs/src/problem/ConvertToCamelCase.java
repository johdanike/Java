package problem;

public class ConvertToCamelCase {
    public static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        boolean nextUpper = false;
        for (char c : s.toCharArray()) {
            if (c == '-' || c == '_') {
                nextUpper = true;
            } else if (nextUpper) {
                sb.append(Character.toUpperCase(c));
                nextUpper = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static String camelCase(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-' || c == '_') {
                word.append(Character.toUpperCase(s.charAt(++i)));
            }
//            else if (c == '_
        }
        sb.append(word);
        return sb.toString();
    }


    public static void main(String[] args) {
        String number = ConvertToCamelCase.toCamelCase("the-shealth-warrior");
        String number1 = ConvertToCamelCase.toCamelCase("The_Stealth_Warrior");
        System.out.println(number);
        System.out.println(number1);

        String word = ConvertToCamelCase.camelCase("the-shealth-warrior");
        System.out.println(word);
    }
}







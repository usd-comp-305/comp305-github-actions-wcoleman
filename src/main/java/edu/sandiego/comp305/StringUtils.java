package edu.sandiego.comp305;

public class StringUtils {
    public static String reverseString(String string){
        if (string == null) {
            return null;
        }

        String reversedString = "";
        for (int i = 0; i<string.length(); i++) {
            reversedString = string.charAt(i) + reversedString;
        }
        return reversedString;
    }
}

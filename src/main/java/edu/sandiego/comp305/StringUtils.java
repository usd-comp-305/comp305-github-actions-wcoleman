package edu.sandiego.comp305;

public class StringUtils {
    public static String reverseString(String string){
        String reversedString = "";
        for (int i = 0; i<string.length(); i++) {
            reversedString = string.charAt(i) + reversedString;
        }
        return reversedString;
    }
}

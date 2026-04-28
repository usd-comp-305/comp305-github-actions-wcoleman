package edu.sandiego.comp305;

public class StringUtils {
    private StringUtils() {}

    public static String reverseString(final String string){
        if (string == null) {
            return null;
        }

        String reversedString = "";
        for (int i = 0; i<string.length(); i++) {
            reversedString = string.charAt(i) + reversedString;
        }
        return reversedString;
    }

    public static void main(final String[] args) {
        final String teststring = "hello";
        System.out.println(reverseString(teststring));
    }
}

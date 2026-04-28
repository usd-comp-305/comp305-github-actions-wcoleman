package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverseStringEvenLetters() {
        String reversed = StringUtils.reverseString("jake");
        assertEquals("ekaj", reversed);
    }

    @Test
    void reverseStringOddLetters() {
        String reversed = StringUtils.reverseString("hello");
        assertEquals("olleh", reversed);
    }

    @Test
    void reverseStringNoLetters() {
        String reversed = StringUtils.reverseString("");
        assertEquals("", reversed);
    }

    @Test
    void reverseStringCapitalLetter() {
        String reversed = StringUtils.reverseString("jAke");
        assertEquals("ekAj", reversed);
    }

    @Test
    void reverseStringWithNumber() {

    }

    @Test
    void reverseStringOneLetter() {

    }

    @Test
    void reverseStringNullReturnsNull() {

    }

    @Test
    void reverseStringContainsSpace() {

    }
}
package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverseStringEvenLetters() {
        final String reversed = StringUtils.reverseString("jake");
        assertEquals("ekaj", reversed);
    }

    @Test
    void reverseStringOddLetters() {
        final String reversed = StringUtils.reverseString("hello");
        assertEquals("olleh", reversed);
    }

    @Test
    void reverseStringNoLetters() {
        final String reversed = StringUtils.reverseString("");
        assertEquals("", reversed);
    }

    @Test
    void reverseStringCapitalLetter() {
        final String reversed = StringUtils.reverseString("jAke");
        assertEquals("ekAj", reversed);
    }

    @Test
    void reverseStringWithNumber() {
        final String reversed = StringUtils.reverseString("jake20");
        assertEquals("02ekaj", reversed);
    }

    @Test
    void reverseStringOneLetter() {
        final String reversed = StringUtils.reverseString("j");
        assertEquals("j", reversed);
    }

    @Test
    void reverseStringNullReturnsNull() {
        final String reversed = StringUtils.reverseString(null);
        assertNull(reversed);
    }

    @Test
    void reverseStringContainsSpace() {
        final String reversed = StringUtils.reverseString("jake coleman");
        assertEquals("nameloc ekaj", reversed);
    }
}

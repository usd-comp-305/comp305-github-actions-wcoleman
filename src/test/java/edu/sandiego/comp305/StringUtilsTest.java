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

    }

    @Test
    void reverseStringNoLetters() {

    }

    @Test
    void reverseStringCapitalLetter() {

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
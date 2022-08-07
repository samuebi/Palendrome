package com.bsamuel.examples.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalendromeTest {

    @Test
    void isPalindrome() {
        String pal = "Malayalam";
        String pal1 = "Hello World";

        assertEquals(true,Palendrome.isPalindrome(pal.toLowerCase()));
        assertEquals(false,Palendrome.isPalindrome(pal1.toLowerCase()));
    }
}
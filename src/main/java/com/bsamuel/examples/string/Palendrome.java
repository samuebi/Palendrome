package com.bsamuel.examples.string;

import java.util.stream.IntStream;

public class Palendrome {
    public static boolean isPalindrome(String str) {
        return IntStream.range(0, str.length() / 2).
                noneMatch((p-> str.charAt(p) != str.charAt(str.length() - p - 1)));
    }
}

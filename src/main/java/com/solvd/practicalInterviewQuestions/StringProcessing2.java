package com.solvd.practicalInterviewQuestions;

public class StringProcessing2 {
    public static boolean isTwoStringsPalindromes(String a, String b) {
        if (a.length()!=b.length()) {
            return false;
        }
        b = new StringBuilder(b).reverse().toString();
        return a.hashCode() == b.hashCode() && a.equals(b);
    }
}

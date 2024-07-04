package com.solvd.practicalInterviewQuestions;

public class StringProcessingTest {
    public static void main(String[] args) {
        System.out.println(StringProcessing.processString("3[asdf]"));
        System.out.println(StringProcessing.processString("3[a]4[b]"));
        System.out.println(StringProcessing.processString("3[a2[b]]"));
    }
}

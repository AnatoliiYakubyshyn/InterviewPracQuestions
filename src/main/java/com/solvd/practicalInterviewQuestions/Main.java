package com.solvd.practicalInterviewQuestions;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("coffee", 100);
        hashMap.put("cake", 200);
        hashMap.put("popcorn", 225);
        combinations.printCombs(400, hashMap);
    }
}

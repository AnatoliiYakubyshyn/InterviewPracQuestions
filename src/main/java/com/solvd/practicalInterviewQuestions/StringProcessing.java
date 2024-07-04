package com.solvd.practicalInterviewQuestions;

public class StringProcessing {

    public static String processString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    num *= 10;
                    num += input.charAt(i) - 48;
                    i++;
                }
                if (input.charAt(i) != '[') {
                    stringBuilder.append(num).append(input.charAt(i));
                } else {
                    int j = i + 1;
                    int cntO = 1;
                    int cntCl = 0;
                    while (j < input.length()) {
                        if (input.charAt(j) == ']') {
                            cntCl++;
                        } else {
                            if (input.charAt(j) == '[') {
                                cntO++;
                            }
                        }
                        if (cntCl==cntO) {
                            break;
                        }
                        j++;
                    }
                    if (input.charAt(j)!=']') {
                        stringBuilder.append("[");
                    } else {
                        String inner = processString(input.substring(i + 1, j));
                        stringBuilder.append(inner.repeat(num));
                        i = j;
                    }

                }
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}

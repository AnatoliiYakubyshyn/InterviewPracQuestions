package com.solvd.practicalInterviewQuestions;

import java.util.List;

public class CalculationMatrixTest {

    public static void printRes(List<int[]> res) {
        for (int[] a : res) {
            System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
        }
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        List<int[]> res = CalculationInMatrixAdvanced.getRectangle(image);
        System.out.println("TEST CASE#1:");
        printRes(res);

        int[][] image2 = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},

        };
        System.out.println("TEST CASE#2:");
        printRes(CalculationInMatrixAdvanced.getRectangle(image2));
    }
}

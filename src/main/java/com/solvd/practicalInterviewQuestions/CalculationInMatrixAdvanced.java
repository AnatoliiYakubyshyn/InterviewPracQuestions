package com.solvd.practicalInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class CalculationInMatrixAdvanced {

    public static List<int[]> getRectangle(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    int[] innerAns = new int[4];
                    innerAns[0] = i;
                    innerAns[1] = j;
                    int k = i;
                    while (k < matrix.length && matrix[k][j] == 0) {
                        k++;
                    }
                    int i2 = k - 1;
                    k = j;
                    while (k < matrix[0].length && matrix[i][k] == 0) {
                        k++;
                    }
                    int j2 = k - 1;
                    innerAns[2] = i2;
                    innerAns[3] = j2;
                    res.add(innerAns);
                    for (int o = innerAns[0]; o <= innerAns[2]; o++) {
                        for (int r = innerAns[1]; r <= innerAns[3]; r++) {
                            visited[o][r] = true;
                        }
                    }
                }
            }
        }
        return res;
    }
}

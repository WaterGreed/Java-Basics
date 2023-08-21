package com.epam.rd.autotasks.matrices;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int rowsAmount = matrix.length;
        int columnsAmount = matrix[0].length;
        int[][] transporedMatrix = new int[columnsAmount][rowsAmount];

        for(int i = 0; i < columnsAmount; i++) {
            for(int  j = 0; j < rowsAmount; j++) {
                transporedMatrix[i][j] = matrix[j][i];
            }
        }
        return transporedMatrix;
    }
}

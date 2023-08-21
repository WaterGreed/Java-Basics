package com.epam.rd.autotasks.matrices;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rowsAmount1 = matrix1.length;
        int columnsAmount2 = matrix2[0].length;
        int[][] multipliedMatrix = new int[rowsAmount1][columnsAmount2];

        for(int i = 0; i < rowsAmount1; i++) {
            for(int j = 0; j < columnsAmount2; j++) {
                for(int k = 0; k < matrix1[0].length; k++) {
                    multipliedMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return multipliedMatrix;
    }
}

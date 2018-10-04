package com.test.java;

import java.util.Scanner;

public class MatrixTest {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows (1-10): ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns (1-10): ");
        int cols = input.nextInt();

        // Create originalMatrix as rectangular two dimensional array
        int[][] originalMatrix = new int[rows][cols];

        // Assign random values to originalMatrix
        for (int row = 0; row < originalMatrix.length; row++)
            for (int col = 0; col < originalMatrix[row].length; col++) {
                originalMatrix[row][col] = (int) (Math.random() * 1000);
            }

        // Print original matrix
        System.out.println("\nOriginal matrix:  size => "+originalMatrix.length);
        printMatrix(originalMatrix);

        // Transpose matrix
        int[][] resultMatrix = transposeMatrix(originalMatrix);


        // Print transposed matrix
        System.out.println("\nTransposed matrix:");
        printMatrix(resultMatrix);
    }
    
    
    public static int[][] transposeMatrix(int[][] matrix) {
    	int m = matrix.length;
    	int n = matrix[0].length;
    	
    	System.out.println(m);
    	System.out.println(n);
    	
    	int[][] transposeMatrix = new int[n][m];
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < m; j++) {
    			transposeMatrix[i][j] = matrix[j][i];
    		}
    	}
    	
    	return transposeMatrix;
    }

    /** The method for printing the contents of a matrix */
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "  ");
            }
            System.out.println();
        } 
    }


}
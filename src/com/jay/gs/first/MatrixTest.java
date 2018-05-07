package com.jay.gs.first;

public class MatrixTest {

	public static void main(String[] args) {
		
		int[][] mat = new int[][]{{1, 3, 6},{5, 6, 9},{7,5,1}};
		int[][] mat2 = new int[][]{{1, 3, 6, 8},{5, 6, 9, 2},{7, 5, 1, 14}, {3, 7, 5, 1}};
		int[][] mat3 = new int[][]{{1, 3, 6, 8, 9, 15}, {5, 6, 9, 7, 4, 2}, {7, 5, 3, 6, 1, 14}, {3, 11, 7, 5, 8, 1}, {9, 10, 23, 1, 7, 9}};
		int[][] mat4 = new int[][]{{1, 3, 6, 9}, {5, 6,  4, 2}, {7, 5, 1, 14}, {3, 11, 7,  1}, {9, 10, 23, 1}};
		
		
 		printMatrixInSpiralForm(mat3);
 		System.out.println("**********************************");
// 		printMatrix(mat3);
	}

	public static void printMatrix(int[][] matrix) {
		
		for(int i = 0; i< matrix.length; i++) {
			int[] m = matrix[i];
			for(int j = 0; j< m.length; j++) {
				System.out.println(m[j]);
			}
			
		}
	}
	
	public static void printMatrixInSpiralForm(int[][] matrix) {
		int rowStart = 0, colStart = 0;
		int rows = matrix.length, cols = matrix[0].length;
		
		while(colStart<= (cols - 1) || rowStart <= (rows -1)) {
			
			// Moving right
			for(int i = colStart; i < cols; i++) {
				System.out.println(matrix[rowStart][i]);
			}

			// Moving down
			for(int i = rowStart + 1; i < rows; i++) {
				System.out.println(matrix[i][cols - 1]);
			}
			
			// Moving left
			for(int i = cols - 2; i >= colStart; i--) {
				System.out.println(matrix[rows - 1][i]);
			}
			
			// Moving up
			for(int i = rows - 2 ; i > rowStart; i--) {
				System.out.println(matrix[i][colStart]);
			}
			System.out.println("******************************* ");
			rowStart++;
			colStart++;
			rows--;
			cols--;
		}
		
	}
}

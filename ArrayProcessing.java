package chapter1;

import java.util.Arrays;

public class ArrayProcessing {

	public static void main(String[] args) {
		// Find the maximum of the array values
		double[] a = {1, 4, 10, -4, 3, 15, -30, 13, 24, -4, 13};
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("The maximum value of array is: " + max);

		
		// Compute the average of the array values
		int N = a.length;
		double sum = 0;
		for (int i = 0; i < N; i++) {
			sum += a[i];
		}
		double average = sum / N;
		System.out.println("The average value of array is: " + average);
		
		
		// Copy an array to another array
		int arraySize = a.length;
		double[] b = new double[arraySize];
		for (int i = 0; i < arraySize; i++) {
			b[i] = a[i];
		}
		System.out.println("The array a is copied to array b. the array b values are:\n" + Arrays.toString(b));
		
		
		// Reverse the elements within an array
		int aSize = a.length;
		for (int i = 0; i < aSize/2; i++) {
			double temp = a[i];
			a[i] = a[aSize - i - 1];
			a[aSize - i - 1] = temp;
		}
		System.out.println("The reverse of array a is: \n" + Arrays.toString(a));
		
		
		// Matrix-Matrix multiplication (square matrices)
		int[][] m = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};  // 3 by 3 matrix
		int[][] n = {{4, 5, 6}, {0, 1, 2}, {4, 1, 6}};
		int mSize = m.length;
		double[][] o = new double[mSize][mSize];
		
		for (int i = 0; i < mSize; i++) {
			for (int j = 0; j < mSize; j++) {
				// Compute dot product of row i and column j.
				for (int k = 0; k < mSize; k++) {
					o[i][j] += m[i][k] * n[k][j];
				}
			}
		}		
	}

}

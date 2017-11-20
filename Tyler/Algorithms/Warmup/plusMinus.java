import java.io.*;
import java.util.*;

public class Solution {

	// Divide numbers into different categories
	private static float[] fractionOfNum(int n, int[] numList) {
		
		// Create an array to store number types 
		float[] numTypes = new float[3];
		
		// Iterate through each value in the input array
		for (int i = 0; i < n; i++) {
			if (numList[i] > 0) {
				numTypes[0]++; // positive
			} else if (numList[i] < 0) {
				numTypes[1]++; // negative
			} else {
				numTypes[2]++; // zero
			}
		}
		// Create the fractions
		for (int i = 0; i < 3; i++) {
			numTypes[i] = numTypes[i] / n;
		}
		return numTypes;
	}
	
	// Main function
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numList = new int[n];
		for (int i = 0; i < n; i++) {
			numList[i] = in.nextInt();
		}
		float[] result = fractionOfNum(n, numList);
		for (int i = 0; i < 3; i++) {
			System.out.println(String.format("%.6f", result[i]));
		}	
	}
}
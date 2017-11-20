import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
		
	// This function determines what grades to round
	static int[] solve(int[] grades){
		
		// Define local variables
		int arraySize = grades.length;
		int[] result  = new int[arraySize];  
		
		// Iterate through the grades
		for (int i = 0; i < arraySize; i++) {
			
			// Pull a grade from "grades" to evaluate
			int grade = grades[i]; 
			if (grade >= 38) {
				int dist2NxtMult = (5 - grade % 5); // distance to next multiple of 5
				if ((dist2NxtMult) < 3) {
					grade = grade + dist2NxtMult; // round to the next multiple of 5
				}
			}
			// Append new grade to return array
			result[i] = grade; 
		}
		return result;
	}
	
	// main function  
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for(int grades_i=0; grades_i < n; grades_i++){
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
	}
}
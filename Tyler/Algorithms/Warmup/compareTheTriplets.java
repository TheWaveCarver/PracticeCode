import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
		
	// Determines who to award points to
	private static String compareScores(int a, int b) {
		if (a > b) {
			return "a";
		} else if (a < b) {
			return "b";
		} else {
			return "n"; // No points awarded
		}
	}
	
	// Adds up the points
	private static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		
		// Create arrays
		String[] awardPoints = new String[3];
		int[] storePoints = new int[2];  
		
		// Determine who is awarded points
		awardPoints[0] = compareScores(a0, b0);
		awardPoints[1] = compareScores(a1, b1);
		awardPoints[2] = compareScores(a2, b2);
		
		// Calculate score
		for (int i = 0; i < 3; i++) {
			if (awardPoints[i] == "a") {
				storePoints[0] += 1;
			} else if (awardPoints[i] == "b") {
				storePoints[1] += 1;
			}        
		}
		return storePoints;
	}
		
	// Main function
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int[] result = solve(a0, a1, a2, b0, b1, b2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");
	}
}
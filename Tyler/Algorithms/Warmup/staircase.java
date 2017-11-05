import java.io.*;
import java.util.*;

public class Solution {
  
  // Returns an array of strings representing each "step"
	private static String[] constructStairs(int n) {
		
		// Define an array to store each "step" 
		String[] stairArray  = new String[n];

		// Determine the number of " " and "#" 
		for (int i = 0; i < n; i++) {
			String spaces  = new String(new char[(n-(i+1))]).replace("\0", " ");
			String hashtag = new String(new char[i+1]).replace("\0", "#");
			String stair   = spaces + hashtag;
			stairArray[i]  = stair;  
		}
    return stairArray;
	}

  // Main function
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
	  String[] stairArray = constructStairs(n);
		for (int i = 0; i < n; i++) {
			System.out.println(stairArray[i]);
		}
	}
}
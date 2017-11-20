import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// Determines min and max sum (4 out of 5 elements)
	private static long[] miniMaxSum(long[] numArray) {
		
		// Create a long array
		long[] storeData = new long[2];

		// Quicksort implementation
		Arrays.sort(numArray);
		
		long middleSum = numArray[1] + numArray[2] + numArray[3];
		long minSum    = middleSum   + numArray[0];
		long maxSum    = middleSum   + numArray[4];

		// Place min and max sum into array
		storeData[0] = minSum;
		storeData[1] = maxSum;
		return storeData;
	}

	// Main function
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[5];
		for(int arr_i=0; arr_i < 5; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		long[] miniMaxSum = miniMaxSum(arr); 
		System.out.print(miniMaxSum[0] + " " + miniMaxSum[1]);
	}
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// Determine number of the largest candles
	static int birthdayCakeCandles(int n, int[] ar) {

		// Sort the array (Quicksort implementation)
		Arrays.sort(ar);

		// The largest candle
		int largestCandle = ar[(n-1)];

		// Determine the number of the largest candle
		boolean counting = true;
		int countCandles = 1; 
		while(counting) {
			if (countCandles == n) { 															// if all candles have been counted
				counting = false;
			} else if (largestCandle == ar[(n-1)-countCandles]) { // if next candle is equal to the largest candle 
				countCandles++;
			} else { 																							// if next candle is not equal to the largest candle
				counting = false;
			} 
		}
		return countCandles;
	}

	// Main function
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}
}
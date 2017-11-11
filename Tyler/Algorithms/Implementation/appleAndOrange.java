import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	private static int fallingFruit(int leftSideHouse, int rightSideHouse, int tree, int[] fruit) {

		// Define variables
		int countFruit = 0; 

    // Determine what fruits falls onto the house
		for (int i = 0; i < fruit.length; i++) {
			if (((tree + fruit[i]) >= leftSideHouse) && ((tree + fruit[i]) <= rightSideHouse)) {
				countFruit++;
			}
		}
		return countFruit; // return the number of fruit on house
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt(); // left side of house 
		int t = in.nextInt(); // right side of house
		int a = in.nextInt(); // left apple tree
		int b = in.nextInt(); // right orange tree
		int m = in.nextInt(); // number of apples
		int n = in.nextInt(); // number of oranges
		int[] apple = new int[m];
		for(int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for(int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		int appleResult  = fallingFruit(s, t, a, apple);
		int orangeResult = fallingFruit(s, t, b, orange);
		System.out.println(appleResult);
		System.out.println(orangeResult);
	}
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int migratoryBirds(int n, int[] ar) {

    // Define variables
    int[] birdCounter = new int[6]; // birdCounter[0] is a placeholder - not used
    int[] mostCommon  = new int[2]; // ['Bird Type', 'Population']

    // Iterate through array
    for (int i=0; i<n; i++) {
      birdCounter[ar[i]]++;
    }
    // Determine the most common bird, iterate in the reverse direction
    for (int i=5; i>0; i--) {
      if (birdCounter[i] >= mostCommon[1]) {
        mostCommon[0] = i;              // Change 'Bird Type'
        mostCommon[1] = birdCounter[i]; // Change 'Population'
      }
    }
    return mostCommon[0]; // return 'Bird Type'
  }

  // main function
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ar = new int[n];
    for(int ar_i = 0; ar_i < n; ar_i++){
      ar[ar_i] = in.nextInt();
    }
    int result = migratoryBirds(n, ar);
    System.out.println(result);
  }
}
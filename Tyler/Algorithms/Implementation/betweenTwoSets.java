import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int getTotalX(int[] a, int[] b) {

    // Sort arrays
    Arrays.sort(a);
    Arrays.sort(b);

    // Define variables
    int aLength   = a.length;
    int bLength   = b.length;
    int largestA  = a[aLength - 1];
    int smallestB = b[0];
    
    boolean addValue = true; // if set false, 'newValue' does not satisfy conditions

    // Create arrayList to store values
    ArrayList<Integer> storeBetweenValues = new ArrayList<Integer>();

    // Iterate 'newValue' through 'a' and 'b' array
    for (int newValue = largestA; newValue <= smallestB; newValue++) {
      for (int j = 0; j < aLength; j++) {
        if (newValue%a[j] != 0) {
          addValue = false;
        } 
      }
      for (int j = 0; j < bLength; j++) {
        if (b[j]%newValue != 0) {
          addValue = false;
        }
      }
      if (addValue) {
        storeBetweenValues.add(newValue);
      }
      addValue = true;
    }
    return storeBetweenValues.size();
  }

  // main function
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] a = new int[n];
    for(int a_i = 0; a_i < n; a_i++){
      a[a_i] = in.nextInt();
    }
    int[] b = new int[m];
    for(int b_i = 0; b_i < m; b_i++){
      b[b_i] = in.nextInt();
    }
    int total = getTotalX(a, b);
    System.out.println(total);
    in.close();
  }
}
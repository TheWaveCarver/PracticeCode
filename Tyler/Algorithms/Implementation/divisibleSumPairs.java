import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int divisibleSumPairs(int n, int k, int[] ar) {
    // n,  number of elements in array 'ar'
    // k,  positive integer outside of array 'ar'
    // ar, array that contains integers
  
    // Define variables
    int countDSP      = 0; // 'Divisible Sum Pair'
    int pairSum       = 0;
    int stopCondition = (n-1);

    // Iterate through array 'ar'
    for (int i=0; i<n; i++) {
      if (i < stopCondition) {
        for (int j=(i+1); j<n; j++) {
          pairSum = ar[i] + ar[j];
          if (pairSum%k == 0) {
            countDSP++;
          }
          pairSum = 0; 
        }
      }
    }
    return countDSP;
  }

  // main function
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] ar = new int[n];
    for(int ar_i = 0; ar_i < n; ar_i++){
      ar[ar_i] = in.nextInt();
    }
    int result = divisibleSumPairs(n, k, ar);
    System.out.println(result);
  }
}
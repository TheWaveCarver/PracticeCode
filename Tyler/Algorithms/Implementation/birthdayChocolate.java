import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int solve(int n, int[] s, int d, int m){
    // n, chocolate row length
    // s, chocolate row integers
    // d, sum to be achieved
    // m, consecutive values to achieve sum

    // Define variables
    int sumIntegers     = 0;
    int countValidBreak = 0;

    // Create stop condition variable 
    int stopCondition = (n-m)+1;

    // Determine if chocolate is valid break
    for (int i = 0; i < stopCondition; i++) {
      for (int j = 0; j < m; j++) {
        sumIntegers = sumIntegers + s[i+j]; 
      }
      if (sumIntegers == d) {
        countValidBreak++;
      }
      sumIntegers = 0;
    }
    return countValidBreak; 
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] s = new int[n];
    for(int s_i=0; s_i < n; s_i++){
      s[s_i] = in.nextInt();
    }
    int d = in.nextInt();
    int m = in.nextInt();
    int result = solve(n, s, d, m);
    System.out.println(result);
  }
}
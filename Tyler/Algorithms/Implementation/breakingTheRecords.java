import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  // Determine number of 'high' and 'low' scores
  static int[] getRecord(int[] s){
    
    // Define variables 
    int lowScore      = s[0]; 
    int highScore     = s[0]; 
    int numScores     = s.length;
    int[] recordScore = new int[2];

    // Iterate through the scores 
    for (int i = 1; i < numScores; i++) {
      if (s[i] < lowScore) {
        recordScore[1]++;
        lowScore = s[i];
      } 
      else if (s[i] > highScore) {
        recordScore[0]++;
        highScore = s[i];
      }
    }
    return recordScore;
  }

  // main function
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] s = new int[n];
    for(int s_i=0; s_i < n; s_i++){
      s[s_i] = in.nextInt();
    }
    int[] result = getRecord(s);
    String separator = "", delimiter = " ";
    for (Integer val : result) {
      System.out.print(separator + val);
      separator = delimiter;
    }
    System.out.println("");
  }
}
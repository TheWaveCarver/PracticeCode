import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static String solve(int year){

    // Define variables
    String yearString      = String.valueOf(year);
    String dayOfProgrammer = null;

    // Determine the 256th day 
    if (year < 1918) {
      if (year%4 == 0) {
        dayOfProgrammer = "12.09." + yearString;
      } else {
        dayOfProgrammer = "13.09." + yearString;
      }
    } 
    else if (year > 1918) {
      if (year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
        dayOfProgrammer = "12.09." + yearString;
      } else {
        dayOfProgrammer = "13.09." + yearString;
      }
    } 
    else {
      // Transition happened on 1/31/1918. Next day was 2/14/1918
      dayOfProgrammer = "26.09.1918";
    }
    return dayOfProgrammer;
  }

  // main function
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int year = in.nextInt();
    String result = solve(year);
    System.out.println(result);
  }
}
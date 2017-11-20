import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  // Function to convert to military time
  static String timeConversion(String s) {

  // s is in the format: "07:05:45PM"
  // s is split on every ":" occurence
  // ss[] is in format: {"07", "05", "45PM"}
  String ss[] = s.split(":");

  // Determine if time is PM or AM
  boolean isPM = ss[2].contains("PM"); 
  if (isPM) {
    int convertTime = Integer.parseInt(ss[0]);
    if (convertTime != 12) {             // if range is 12PM to 12:59PM
      convertTime = convertTime + 12;    // add 12, else do not change
    }
    ss[0] = String.valueOf(convertTime); // convert hour back to string 
    ss[2] = ss[2].replace("PM", "");     // remove "PM" 
  } else {
    int convertTime = Integer.parseInt(ss[0]);
    if (convertTime == 12) {             // if range is 12AM to 12:59AM
      ss[0] = "00";                      // change hour to "00"
    }
    ss[2] = ss[2].replace("AM", "");     // remove "AM"
  }
  // Parse new time together.
  String militaryTime = ss[0] + ":" +
                        ss[1] + ":" +
                        ss[2];
  return militaryTime;
  } 

  // main function
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = timeConversion(s);
    System.out.println(result);
  }
}
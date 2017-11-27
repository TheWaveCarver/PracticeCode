import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static String kangaroo(int x1, int v1, int x2, int v2) {

    // Define variables
    String doKangaroosMeet = "NO"; // return this variable
    boolean behindKangaroo = true; // Once x1 kangaroo passes or meets x2 kangaroo

    // Determine whether kangaroos will meet
    if (v1 <= v2) {
      return doKangaroosMeet; 
    } else {
      while (behindKangaroo) {
        x1 = x1 + v1;
        x2 = x2 + v2;
        if (x1 > x2) {
          behindKangaroo = false;
        } else if (x1 == x2) {
          behindKangaroo  = false;
          doKangaroosMeet = "YES";
        }
      }
      return doKangaroosMeet;
    }
  }

  // main function
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x1 = in.nextInt();
    int v1 = in.nextInt();
    int x2 = in.nextInt();
    int v2 = in.nextInt();
    String result = kangaroo(x1, v1, x2, v2);
    System.out.println(result);
  }
}
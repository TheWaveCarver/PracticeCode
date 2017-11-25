import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int bonAppetit(int n, int k, int b, int[] ar) {
    // n,  number of items on menu
    // k,  item on menu that Anna cannot eat
    // b,  the amount Brian charged
    // ar, prices of items on menu

    // Define variables
    int commonMealCost = 0;
    int annaShouldPay  = 0;
    int refundAmt      = 0;

    // Determine how much Brian owes Anna
    for (int i = 0; i < n; i++) {
      if (i != k) {
        commonMealCost = commonMealCost + ar[i];
      }
    }
    annaShouldPay = commonMealCost / 2;
    refundAmt = b - annaShouldPay;
    return refundAmt;
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
    int b = in.nextInt();
    int result = bonAppetit(n, k, b, ar);
    if (result != 0) {
      System.out.println(result);
    } else {
      System.out.println("Bon Appetit");
    }
  }
}
import java.io.*;
import java.util.*;

public class Solution {
  
  // Sums the diagonal array
  private static int sumArray(int [] diagonalArray) {
    int sum = 0;
    for (int i = 0; i < diagonalArray.length; i++) {
      sum += diagonalArray[i];
    }
    return sum;
  }

  // Creates an array for primary and secondary diagonal
  private static int diagonalDifference(int n, int[] numArray) {
    
    // Primary diagonal, indexes are spaced by (n+1)
    int[] primaryDiagonal = new int[n];
    int primaryMarker     = 0; // determines value to be added from numArray
    int p                 = 0; // index for primaryDiagonal 
    
    // Secondary diagonal, indexes are spaced by (n-1)
    int[] secondaryDiagonal = new int[n];
    int secondaryMarker     = n-1; // determines value to be added from numArray
    int q                   = 0;   // index for secondaryDiagonal
    
    // Append values to appropriate diagonal array
    // TODO Could be improved by not creating arrays and just adding to 
    // a primarySum and secondarySum variable below (Remove "sumArray" function)
    for (int i = 0; i < (n*n); i++) {
      if (i == primaryMarker) {
        primaryDiagonal[p] = numArray[i];
        primaryMarker += (n+1);
        p++;
      }
      // Two separate 'if' statements since a value can be on secondaryDiagonal and primaryDiagonal
      if ((i == secondaryMarker) && (q < n)) { // (q < n) to prevent adding bottom right element
        secondaryDiagonal[q] = numArray[i];
        secondaryMarker += (n-1);
        q++;
      }
    }
    
    // Assign the array sums to variables 
    int primarySum   = sumArray(primaryDiagonal);
    int secondarySum = sumArray(secondaryDiagonal);

    // Calculate and return the difference
    int difference = primarySum - secondarySum;
    return Math.abs(difference);
  }
  
  // main function  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] numbers = new int[n*n];
    for(int i = 0; i < n*n; i++){
      numbers[i] = in.nextInt();
    }
    int result = diagonalDifference(n, numbers);
    System.out.println(result);
  }
}
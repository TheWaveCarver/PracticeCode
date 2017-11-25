import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    /* Name some constants used in the program */
    int rows = 6;				        // Number of rows in the matrix
    int cols = 6;				        // Number of columns in the matrix
    int minValueInArray = -9;	  // Minimum value of an element in the matrix
    int elementsInHourGlass = 7;// Number of elements in an hourglass

    // Set max to the minimum hourglass sum possible
    int maxHourGlassSum = minValueInArray * elementsInHourGlass;

    // Declare the matrix of numbers
    int matrix[][] = new int[rows][cols];
    int hourGlassSum;	// Sum of the elements in the hourglass

    /* Read the values for the matrix looping thru the rows */
    for(int i=0; i < rows; i++){
      /* Loop thru the columns for each row, reading the matrix */
      for(int j=0; j < cols; j++){
        /* Read the next value from standard input */
        matrix[i][j] = stdIn.nextInt();
        }
      }
      /* Loop thru the possible starting points of the hourglass */
      for (int i=0; i < (rows-2); i++) {
        for (int j=0; j<(cols-2); j++) {
          /* Compute the sum of the elements in the hourglass */
          hourGlassSum = matrix[i][j]   + matrix[i][j+1]   +   
          matrix[i][j+2] + matrix[i+1][j+1] +
          matrix[i+2][j] + matrix[i+2][j+1] +
          matrix[i+2][j+2];
          /* Is the new hourglass sum greater than the max found so far */
          if (hourGlassSum > maxHourGlassSum) {
            maxHourGlassSum = hourGlassSum;
          }
        }
      }
      System.out.println(maxHourGlassSum);
    }
  }
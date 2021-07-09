import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;


public class GridImage {

  public static void main(String[] args) {

    int rows = 250;
    int cols = 250;

    int[][] grid = new int[rows][cols];

    print2d(grid);
    System.out.println();

    colPop(grid, 4, 255);
    print2d(grid);
    System.out.println();

    rowPop(grid, 10, 255);
    print2d(grid);
    System.out.println();

    diagonal(grid, 8, 3, 0, 255);
    print2d(grid);

    diagonal(grid, 0, 5, 3, 255);
    print2d(grid);

    ImageTest.drawImage( grid );
    invert(grid);
    ImageTest.drawImage( grid );
  }//end main

  /*
    0: up + left
    1: up + right
    2: down + left
    3: down + right
   */
  public static void diagonal(int[][] d2, int r, int c, int direction, int value) {

    int stepR = -1;
    int stepC = -1;

    if (direction == 1) {
      stepC = 1;
    }
    else if (direction == 2) {
      stepR = 1;
    }
    else if (direction == 3) {
      stepR = 1;
      stepC = 1;
    }

    while (r >= 0 && r < d2.length &&
           c >= 0 && c < d2[r].length ) {

      d2[r][c] = value;
      r+= stepR;
      c+= stepC;
    }//end while
  }//end diagonal

  public static void invert(int[][] d2) {
    for (int r=0; r < d2.length; r++) {
      for (int c=0; c < d2[r].length; c++) {

        if (d2[r][c] == 0)
          d2[r][c] = 255;
        else
          d2[r][c] = 0;

      }//end r
    }//end c
  }//end invert

  public static void colPop(int[][] d2, int c, int value) {

    for (int r=0; r < d2.length; r++) {

      d2[r][c] = value;
    }//end r for
  }//end colPop

  public static void rowPop(int[][] d2, int r, int value) {

    for (int c=0; c < d2[r].length; c++) {

      d2[r][c] = value;
    }//end r for
  }//end colPop

  public static void print2d(int[][] d2) {

    for (int r=0; r < d2.length; r++) {
      for (int c=0; c < d2[r].length; c++) {

        System.out.printf("%03d ", d2[r][c]);
      }//end c for

      System.out.println();
    }//end r for
  }//end print2d

}
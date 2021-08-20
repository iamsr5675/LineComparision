package com.bridgelabz.LineComparision;

import java.util.Scanner;
public class LineComparision {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int x1, y1, x2, y2;
	  double distance;
      System.out.println("Welcome to Line Comparision Problem");
      System.out.println("Enter the values of first co-ordinates :  ");
      x1 = sc.nextInt();
      y1 = sc.nextInt();
      System.out.println("Enter the values of second co-ordinates :  ");
      x2 = sc.nextInt();
      y2 = sc.nextInt();
      distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      System.out.println("Length of the line : " +distance);
  }
}

package com.bridgelabz.LineComparision;

import java.util.Scanner;
public class LineComparision {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int x1, y1, x2, y2, x3, y3, x4, y4;
	  double distance1, distance2;
      System.out.println("Welcome to Line Comparision Problem");
      System.out.println("Enter the co-ordinates of first line");
      System.out.println("Enter the values of first co-ordinates of Line1:  ");
      x1 = sc.nextInt();
      y1 = sc.nextInt();
      System.out.println("Enter the values of second co-ordinates of Line1:  ");
      x2 = sc.nextInt();
      y2 = sc.nextInt();
      System.out.println("Enter the co-ordinates of second line");
      System.out.println("Enter the values of first co-ordinates of Line2:  ");
      x3 = sc.nextInt();
      y3 = sc.nextInt();
      System.out.println("Enter the values of second co-ordinates of Line2:  ");
      x4 = sc.nextInt();
      y4 = sc.nextInt();
      distance1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      distance2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
      System.out.println("Length of the line1 : " +distance1);
      System.out.println("Length of the line2 : " +distance2);
      if(distance1 == distance2)
      {
    	  System.out.println("Both lines are equal.");
      }
      else if(distance1 > distance2)
      {
    	  System.out.println("Line1 is greater than Line2");
      }
      else
      {
    	  System.out.println("Line1 is smaller than Line2");
      }
  }
}
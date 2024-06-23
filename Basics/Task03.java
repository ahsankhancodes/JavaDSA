package Basics;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;


public class Task03 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter Principal: ");
      float principal = input.nextFloat();

      System.out.print("Enter time (in years): ");
      float time = input.nextFloat();

      System.out.print("Enter rate: ");
      float rate = input.nextFloat();
      
      float simInterest = principal * (rate/100) * time;
      System.out.println("Simple interest: "+ simInterest);
  }
}

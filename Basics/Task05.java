package Basics;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class Task05 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first number: ");
      float num1 = input.nextFloat();

      System.out.print("Enter second number: ");
      float num2 = input.nextFloat();

      if(num1 > num2){
        System.out.println(num1 + " is largest number");
      } else {
        System.out.println(num2 + " is largest number");
      }
  }
}

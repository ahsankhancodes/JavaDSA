package Basics;

import java.util.Scanner;

//  * Task01
//  * Write a program to print whether a number is even or odd, also take input from the user.

public class Task01 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number to check whether number is even or odd : ");
    int number = input.nextInt();

    if(number%2 == 0){
      System.out.println(number + " is an even number.");
    } else {
      System.out.println(number + " is an odd number.");
    }

    input.close();
  }
}

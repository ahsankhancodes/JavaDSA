package Basics;

import java.util.Scanner;

//  * Task02
//  * Take name as input and print a greeting message for that particular name.

public class Task02 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your Name: ");
      String name = input.nextLine();

      System.out.println("Hey " + name + ", Welcome to my JavaDSA GitHub Repo.");
      input.close();
  }
}
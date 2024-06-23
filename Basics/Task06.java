package Basics;

// Input currency in rupees and output in USD.

import java.util.Scanner;
public class Task06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter rupees: ");
    float rupees = input.nextFloat();

    System.out.println("USD: " + (rupees * 0.0036));
  }
}

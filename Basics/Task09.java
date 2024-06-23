package Basics;

import java.util.Scanner;

// To find Armstrong Number between two given number.
public class Task09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter lower value: ");
    int low = input.nextInt();

    System.out.print("Enter higher value: ");
    int high = input.nextInt();

    for (int number = low + 1; number < high; ++number) {
      int digits = 0;
      int result = 0;
      int originalNumber = number;

      // number of digits calculation
      while (originalNumber != 0) {
        originalNumber /= 10;
        ++digits;
      }

      originalNumber = number;

      // result contains sum of nth power of its digits
      while (originalNumber != 0) {
        int remainder = originalNumber % 10;
        result += Math.pow(remainder, digits);
        originalNumber /= 10;
      }

      if (result == number) {
        System.out.print(number + " ");
      }
    }
  }
}
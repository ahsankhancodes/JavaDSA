package Basics;
import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class Task08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any word: ");
    String str = input.next().toLowerCase();
    String check = "";
    for (int i = (str.length() - 1); i >= 0; --i) {
        check = check + str.charAt(i);
    }
    if (check.equals(str)) {
      System.out.println("The word is Palindrome.");
    } else{
      System.out.println("The word is not Palindrome.");
    }
  }
}

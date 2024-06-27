import java.util.Scanner;

// 23. Input a number and print all the factors of that number (use loops).
public class Task23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}

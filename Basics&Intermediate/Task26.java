import java.util.Scanner;

// Addition Of Two Numbers
public class Task26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = input.nextInt();

    System.out.print("Enter second number: ");
    int num2 = input.nextInt();

    System.out.println("Sum: " + (num1 + num2));
  }
}

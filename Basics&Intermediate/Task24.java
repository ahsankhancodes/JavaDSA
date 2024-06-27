import java.util.Scanner;

// 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Task24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    int result = 0;
    while (num != 0) { 
        result = result + num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
    }
    System.out.println("Sum: "+ result);
  }
}

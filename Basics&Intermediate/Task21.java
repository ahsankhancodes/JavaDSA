import java.util.Scanner;

// 21. Fibonacci Series In Java Program. 
public class Task21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter n value: ");
    int n = input.nextInt();

    if (n > 0) {
      int n0 = 0, n1 = 1;
      int n3 = n0 + n1;
      System.out.print(n0 + " ");
      System.out.print(n1 + " ");
      for (int i = 0; i < n; i++) {
        System.out.print(n3 + " ");
        n0 = n1;
        n1 = n3;
        n3 = n0 + n1;
      }
    } else {
      System.out.println("Invalid Input");
    }
  }
}

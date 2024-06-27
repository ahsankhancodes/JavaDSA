
import java.util.Scanner;

// 22. Subtract the Product and Sum of Digits of an Integer
public class Task22 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter n value: ");
      int n = input.nextInt();

      int originalNumber = n;
      int digits = 0;
      while(n!=0){
          n = n / 10;
          digits = digits + 1;
      }
      
      int remainder = 0, product = 1, sum = 0;
      for (int i = 0; i < digits; i++) {
        remainder = originalNumber % 10;
        originalNumber = originalNumber / 10;
        product = product * remainder;
        sum = sum + remainder;
      }
      
      System.out.println("Difference: "+ (product - sum));
  }
}

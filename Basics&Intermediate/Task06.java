import java.util.Scanner;

// 6. Area Of Rhombus
public class Task06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first diagonal value: ");
    float diagonal1 = input.nextFloat();

    System.out.print("Enter second diagonal value: ");
    float diagonal2 = input.nextFloat();

    float answer = (float)(0.5 * (diagonal1 * diagonal2));
    System.out.println("Area of Rhombus is "+ answer);
  }
}

import java.util.Scanner;

// 5. Area Of Parallelogram
public class Task05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter base: ");
    float base = input.nextFloat();

    System.out.print("Enter height: ");
    float height = input.nextFloat();

    float answer = (float)(base * height);
    System.out.println("Area of Parallelogram is "+ answer);
  }
}

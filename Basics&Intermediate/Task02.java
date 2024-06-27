import java.util.Scanner;

// 2. Area Of Triangle
public class Task02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter base: ");
    float base = input.nextFloat();

    System.out.print("Enter height: ");
    float height = input.nextFloat();

    float answer = (float)(0.5 * base * height);
    System.out.println("Area of Triangle is "+ answer);
  }
}
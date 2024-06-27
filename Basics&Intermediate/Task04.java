import java.util.Scanner;

// 4. Area Of Isosceles Triangle
public class Task04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter base: ");
    float base = input.nextFloat();

    System.out.print("Enter height: ");
    float height = input.nextFloat();

    float answer = (float)(0.5 * base * height);
    System.out.println("Area of Isosceles Triangle is "+ answer);
  }
}

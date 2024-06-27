import java.util.Scanner;

// 7. Area Of Equilateral Triangle
public class Task07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter value of any side: ");
    float side = input.nextFloat();


    float answer = (float)((Math.sqrt(3)/4) * Math.pow(side, 2));
    System.out.println("Area of Equilateral Triangle is "+ answer);
  }
}

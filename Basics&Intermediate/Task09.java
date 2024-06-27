import java.util.Scanner;

// 9. Perimeter Of Equilateral Triangle
public class Task09 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value of any side: ");
    float side = input.nextFloat();

    float answer = (float)(3 * side);
    System.out.println("Perimeter of Equilateral Triangle is "+ answer);
  }
}

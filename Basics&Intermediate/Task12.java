import java.util.Scanner;

// 12. Perimeter Of Square
public class Task12 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter length of any side: ");
    float side = input.nextFloat();

    float answer = (float)(4 * side);
    System.out.println("Perimeter of Square is "+ answer);
  }
}

import java.util.Scanner;

// 11. Perimeter Of Rectangle
public class Task11 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value of length: ");
    float length = input.nextFloat();

    System.out.print("Enter value of width: ");
    float width = input.nextFloat();

    float answer = (float)(2 * (length + width));
    System.out.println("Perimeter of Rectangle is "+ answer);
  }
}

import java.util.Scanner;

// 10. Perimeter Of Parallelogram
public class Task10 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value of any side: ");
    float side = input.nextFloat();

    System.out.print("Enter value of base: ");
    float base = input.nextFloat();

    float answer = (float)(2 * (side + base));
    System.out.println("Perimeter of Parallelogram is "+ answer);
  }
}

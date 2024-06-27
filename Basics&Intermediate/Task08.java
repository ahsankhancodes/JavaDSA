import java.util.Scanner;

// 8. Perimeter Of Circle
public class Task08 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius: ");
    float radius = input.nextFloat();

    float answer = (float)(2 * Math.PI * radius);
    System.out.println("Perimeter of Circle is "+ answer);
  }
}

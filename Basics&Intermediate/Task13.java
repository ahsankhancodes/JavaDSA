import java.util.Scanner;

// 13. Perimeter Of Rhombus
public class Task13 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter length of any side: ");
    float side = input.nextFloat();

    float answer = (float)(4 * side);
    System.out.println("Perimeter of Rhombus is "+ answer);
  }
}

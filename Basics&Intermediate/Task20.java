import java.util.Scanner;

// 20. Total Surface Area Of Cube
public class Task20 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter any side length of cube: ");
    float side = input.nextFloat();

    float answer = (float)(6 * Math.pow(side, 2));
    System.out.println("Total Surface Area Of Cube is "+ answer);
  }
}

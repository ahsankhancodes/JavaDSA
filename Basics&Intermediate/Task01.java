import java.util.Scanner;

// 1. Area Of Circle Java Program
public class Task01 {
  static final double PI = Math.PI;
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius: ");
    float radius = input.nextFloat();

    float answer = (float)(PI * Math.pow(radius, 2));
    System.out.println("Area of Circle is "+ answer);
  }
}

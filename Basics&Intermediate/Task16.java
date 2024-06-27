import java.util.Scanner;

// 16. Volume Of Cylinder
public class Task16 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius: ");
    float radius = input.nextFloat();

    System.out.print("Enter height: ");
    float height = input.nextFloat();

    float answer = (float)(Math.PI * Math.pow(radius, 2) * height);
    System.out.println("Volume Of Cylinder is "+ answer);
  }
}

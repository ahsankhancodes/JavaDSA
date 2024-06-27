import java.util.Scanner;

// 17. Volume Of Sphere
public class Task17 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius: ");
    float radius = input.nextFloat();

    float answer = (float)(1.33333333 * Math.PI * Math.pow(radius, 3));
    System.out.println("Volume Of Sphere is "+ answer);
  }
}

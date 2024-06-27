import java.util.Scanner;

// 19. Curved Surface Area Of Cylinder
public class Task19 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter radius: ");
    float radius = input.nextFloat();

    System.out.print("Enter height: ");
    float height = input.nextFloat();

    float answer = (float)(2 * Math.PI * radius * height);
    System.out.println("Curved Surface Area Of Cylinder is "+ answer);
  }
}

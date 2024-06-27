import java.util.Scanner;

// 14. Volume Of Cone Java Program
public class Task14 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius: ");
    float radius = input.nextFloat();

    System.out.print("Enter height: ");
    float height = input.nextFloat();

    float answer = (float)((Math.PI * Math.pow(radius, 2)) * (height / 3));
    System.out.println("Volume Of Cone is "+ answer);
  }
}

import java.util.Scanner;

// 18. Volume Of Pyramid
public class Task18 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter base length: ");
    float length = input.nextFloat();

    System.out.print("Enter base width: ");
    float width = input.nextFloat();

    System.out.print("Enter pyramid height: ");
    float height = input.nextFloat();

    float answer = (float)((length * width * height) / 3);
    System.out.println("Volume Of Pyramid is "+ answer);
  }
}

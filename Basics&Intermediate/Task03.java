import java.util.Scanner;

// 3. Area Of Rectangle Program
public class Task03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter length: ");
    float length = input.nextFloat();

    System.out.print("Enter width: ");
    float width = input.nextFloat();

    float answer = (float)(length * width);
    System.out.println("Area of Rectangle is "+ answer);
  }
}

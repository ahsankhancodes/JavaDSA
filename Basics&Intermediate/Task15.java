import java.util.Scanner;

// 15. Volume Of Prism
public class Task15 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter base: ");
    float base = input.nextFloat();

    System.out.print("Enter height: ");
    float height = input.nextFloat();

    float answer = (float)(base * height);
    System.out.println("Volume Of prism is "+ answer);
  }
}

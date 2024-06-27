import java.util.Scanner;

// 25. Take integer inputs till the user enters 0 and print the largest number from all.
public class Task25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    int currentNum;
    int largest = num;
    System.out.print("Enter a number: ");
    while ((currentNum = input.nextInt()) != 0) {
      if(currentNum > largest){
        largest = currentNum;
      }
      System.out.print("Enter a number: ");
    }
    System.out.println("Largest = " + largest);
  }
}

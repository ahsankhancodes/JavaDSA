package Basics;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class Task04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    float num1 = input.nextFloat();

    System.out.print("Enter second number: ");
    float num2 = input.nextFloat();

    System.out.print("Enter any operator (+, -, *, /) :  ");
    Character oper = input.next().charAt(0);

    if(oper == '+'){
      System.out.print(num1 + " + " + num2 + " = " + (num1+num2));
    } else if(oper == '-'){
      System.out.print(num1 + " - " + num2 + " = " + (num1-num2));
    } else if(oper == '*'){
      System.out.print(num1 + " * " + num2 + " = " + (num1*num2));
    } else if(oper == '/'){
      System.out.print(num1 + " / " + num2 + " = " + (num1/num2));
    } else {
      System.err.println("Invalid Input");
    }
  }
}

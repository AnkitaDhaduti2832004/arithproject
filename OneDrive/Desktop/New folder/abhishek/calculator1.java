import java.util.Scanner;

public class calculator1{

   
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

"    System.out.println("Enter first number:");
"    float num1 = in.nextFloat();

    System.out.println("Enter second number:");
    float num2 = in.nextFloat();

    float sum = num1 + num2;
    float difference = num1 - num2;
    float product = num1 * num2;
    float quo = num1 / num2;

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quo);
  }
}


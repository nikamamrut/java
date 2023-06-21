import java.util.Scanner;

public class FactorialCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    try {
      if (number < 0) {
        throw new Exception("Number is not Valids");
      }
      int factorial = 1;
      for (int i = 1; i <= number; i++) {
        factorial *= i;
      }
      System.out.println("Factorial of " + number + ": " + factorial);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
//q6
import java.util.Scanner;

class OverweightProductException extends Exception {
  public OverweightProductException(String message) {
    super(message);
  }
}

class Product {
  private String name;
  private double weight;

  public Product(String name, double weight) throws OverweightProductException {
    this.name = name;
    if (weight > 60) {
      throw new OverweightProductException("Product weight cannot be above 60kg");
    }
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }
}

public class LabExcercise {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter product name: ");
    String name = scanner.nextLine();
    System.out.print("Enter product weight: ");
    double weight = scanner.nextDouble();

    try {
      Product product = new Product(name, weight);
      System.out.println("Product created successfully");
      System.out.println("Product name: " + product.getName());
      System.out.println("Product weight: " + product.getWeight() + "kg");
    } catch (OverweightProductException ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}
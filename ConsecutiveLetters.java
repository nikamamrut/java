//q10
import java.util.Scanner;

public class ConsecutiveLetters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    // Create a new string builder to store the modified string
    StringBuilder sb = new StringBuilder();

    // Iterate through the string, checking for consecutive letters
    for (int i = 0; i < str.length() - 1; i++) {
      // If the current letter is the same as the next one, skip the next one
      if (str.charAt(i) == str.charAt(i + 1)) {
        continue;
      }
      // Otherwise, add the current letter to the modified string
      sb.append(str.charAt(i));
    }
    // Add the last letter to the modified string
    sb.append(str.charAt(str.length() - 1));

    // Print the modified string
    System.out.println("Modified string: " + sb.toString());
  }
}
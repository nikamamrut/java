//q7
import java.util.ArrayList;
import java.util.List;

public class Presentornot {
  public static void main(String[] args) {
    // define the two arrays
    int[] array1 = {1, 2, 3, 4,5};
    int[] array2 = {2, 3, 1, 1, 0, 5, 0, 2, 1};

    // create a list to store the numbers that are not present in array2
    List<Integer> notPresent = new ArrayList<>();

    // iterate through array1
    for (int num : array1) {
      // check if the number is not in array2
      boolean found = false;
      for (int num2 : array2) {
        if (num == num2) {
          found = true;
          break;
        }
      }
      if (!found) {
        // if the number is not in array2, add it to the notPresent list
        notPresent.add(num);
      }
    }

    // print the numbers that are not present in array2
    System.out.println(notPresent);
  }
}
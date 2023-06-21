import java.util.Arrays;

public class Amrut {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4};
    int[] array2 = {10, 9, 8, 7};

    int sum1 = 0;
    int sum2 = 0;

    // Calculate the sum of the elements in array1
    for (int i = 0; i < array1.length; i++) {
      sum1 += array1[i];
    }

    // Calculate the sum of the elements in array2
    for (int i = 0; i < array2.length; i++) {
      sum2 += array2[i];
    }

    // Exchange one element from each array to make their sums equal
    if (sum1 != sum2) {
      int diff = Math.abs(sum1 - sum2);
      if (sum1 > sum2) {
        // Exchange an element from array1 with an element from array2
        for (int i = 0; i < array1.length; i++) {
          for (int j = 0; j < array2.length; j++) {
            if (array1[i] - array2[j] == diff) {
              // Found the pair of elements that need to be exchanged
              int temp = array1[i];
              array1[i] = array2[j];
              array2[j] = temp;

              // Print the modified arrays
              System.out.println(Arrays.toString(array1));
              System.out.println(Arrays.toString(array2));
              return;
            }
          }
        }
      } else {
        // Exchange an element from array2 with an element from array1
        for (int i = 0; i < array2.length; i++) {
          for (int j = 0; j < array1.length; j++) {
            if (array2[i] - array1[j] == diff) {
              // Found the pair of elements that need to be exchanged
              int temp = array2[i];
              array2[i] = array1[j];
              array1[j] = temp;

              // Print the modified arrays
              System.out.println(Arrays.toString(array1));
              System.out.println(Arrays.toString(array2));
              return;
            }
          }
        }
      }
    }

    // The sums are already equal
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
  }
}
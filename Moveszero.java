import java.util.Arrays;

public class {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 0, 5, 0, 7, 0};

        // First, we will count the number of 0's in the array
        int numZeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                numZeros++;
            }
        }

        // Next, we will create a new array with the same length as the original array
        int[] result = new int[array.length];

        // Now we will iterate through the original array again, and copy all the non-zero elements to the new array
        int resultIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[resultIndex] = array[i];
                resultIndex++;
            }
        }

        // Finally, we will add all the 0's to the end of the new array
        for (int i = 0; i < numZeros; i++) {
            result[result.length - i - 1] = 0;
        }

        // Print out the final result
        System.out.println(Arrays.toString(result));
    }
}
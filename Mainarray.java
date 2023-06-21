//q4
import java.util.ArrayList;

public class Mainarray {

    public static void main(String[] args) {
        // Declare an integer array with 10 numbers
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10,};

        // Create an ArrayList to store prime numbers
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        // Create an ArrayList to store non-prime numbers
        ArrayList<Integer> nonPrimeNumbers = new ArrayList<>();

        // Iterate through the numbers array
        for (int number : numbers) {
            if (isPrime(number)) {
                // If the number is prime, add it to the primeNumbers ArrayList
                primeNumbers.add(number);
            } else {
                // If the number is not prime, add it to the nonPrimeNumbers ArrayList
                nonPrimeNumbers.add(number);
            }
        }

        // Print the prime numbers array
        System.out.println("Prime numbers: " + primeNumbers);

        // Print the non-prime numbers array
        System.out.println("Non-prime numbers: " + nonPrimeNumbers);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
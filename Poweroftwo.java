//q8
import java.util.*;

public class Poweroftwo{
  public static void main(String[] args) {
      Scanner s= new Scanner(System.in);    //System.in is a standard input stream  
     System.out.print("Enter first number- ");  
    int num = s.nextInt();  ; // change this value to test different numbers

    // check if num is a power of 2
    if ((num & (num - 1)) == 0) {
      System.out.println(num + " is a power of 2");
    } else {
      System.out.println(num + " is not a power of 2");
    }
  }
}
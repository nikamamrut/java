import java.util.Arrays;

public class Change
{
  public static void main(String[] args)
  {
    int array1[] = {1, 11, 4};
    int array2[] = {1, 3, 10};
    
      for(int i = 0; i < array1.length; i++) {
          for(int j = 0; j < array2.length; j++) {
              int sum1 = sumOfArray(array1);
              int sum2 = sumOfArray(array2);
              
              if(sum1 - array1[i] + array2[j] == sum2 - array2[j] + array1[i]) {
                  int temp = array1[i];
                  array1[i] = array2[j];
                  array2[j] = temp;
                  break;
              }
          }
      }
      
      System.out.println(Arrays.toString(array1) + ": " + sumOfArray(array1));
      System.out.println(Arrays.toString(array2) + ": " + sumOfArray(array2));
  }
  
  public static int sumOfArray(int[] array)
  {
      int sum = 0;
      for(int element : array)
      {
          sum += element;
      }
      
      return sum;
  }
}
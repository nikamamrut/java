class sumofnumbers
{
  public static void main (String args[])
  {
    int num = 15;
    int i;
    int evensum = 0;
    int oddsum = 0;
    int primesum = 0;
    for (i = 1; i <= num; i++)
      {
	if (i % 2 == 0)
	  {
	    evensum = evensum + i;
	  }
	else
	  {
	    oddsum = oddsum + i;
	  }
      } 
	for (int j = 2; j <= num; j++)
	  {
	    boolean isPrime = true;
	    for (i = 2; i * i <= j; i++)
	      {
		if (j % i == 0)
		  {
		    isPrime = false;
		    break;
		  }
	      }
	    if (isPrime)
	      {
		primesum = primesum + j;
	      }
	  }

	System.out.println ("The sum of Even Numbers is:" + evensum);
	System.out.println ("the sum of odd numbersis:" + oddsum);
	System.out.println ("the sum of prime numbersis:" + primesum);
      
  }
}
/**
 * 	Raul Goycoolea
 * 	15-March-2011 
 * 
 * 	Euler Project Problem 1:
 *	from http://projecteuler.net
 *
 * 	
 * 	
**/

public class EulerID1 {

	static int i;
	
	static long total;
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		total=0;
		i=0;
		while (i < 999) 
		{
			i++;
			if (check3() == false ) check5() ;
		
		}
		System.out.printf("El total es: %d", total);
		
	}

	  static boolean check3 () {
		  if(i % 3 == 0)
		  {
		//   System.out.printf("%d number is divisible by 3 \n",i);
		  total += i;
		  return true;
		  }
		  
		return false;
		  
      }

	  static boolean check5 () {
		  if(i % 5 == 0)
		  {
		  // System.out.printf("%d number is divisible by 5 \n",i);
		  total += i;
		  return true;
		  }
		  
		return false;
		  
      }
	
}

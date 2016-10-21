package arraysnstrings;

public class FindElementK {

	private static void swap(int[] array, int i, int j){
	  int tmp = array[i];
	  array[i] = array[j];
	  array[j] = tmp;
	}
	
	public static int findElement(int[] array, int k) throws IllegalArgumentException{
		
	  if (k <= 0)
		  throw new IllegalArgumentException("Value of k not permitted:" +k);
	  
	  int pivot = k - 1; 
	  
	  for(int i=0; i< pivot; i++)
	    if(array[pivot]< array[i])
	      swap(array,i,pivot);
	
	  for(int i= array.length -1 ; i> pivot; i--)
	    if(array[pivot]> array[i])
	      swap(array,i,pivot);
	
	  return array[pivot];
	}
}

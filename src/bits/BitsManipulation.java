package bits;

public class BitsManipulation {

	
	public static int flip2Win(int a){
		
		if (~a == 0 ){
			return Integer.BYTES * 8;
		}
		int max_length = 1; 
		int previous_length=0;
		int current_length=0;
		
		while(a != 0){
			
			if ((a & 1) == 1){
				current_length++;
			}else{
				previous_length = ((a&2) == 0) ? 0:current_length ;
				current_length = 0;
			}
			max_length = Math.max(max_length, previous_length + current_length +1);
			a >>>=1;
		}
		
		return max_length;
	}
	
	public void printNextNumber(int number){
		
	}
	
	
}

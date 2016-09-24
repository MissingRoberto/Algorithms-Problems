package arraysnstrings;
import java.lang.Math;
public class CheckOneWay {
	
	public static boolean checkOneWay(String A, String B){
		
		int CHANGES=1; 
		if (Math.abs(A.length() - B.length()) > CHANGES)
			return false;
		
		int a = 0;
		int b = 0; 
		
		while (CHANGES>=0 && a < A.length() && b < B.length()){
			if (A.charAt(a) == B.charAt(b)){
				a++;
				b++;
				continue;
			}else{
				CHANGES--;
				if(b+1< B.length() && A.charAt(a) == B.charAt(b+1) ){
					// Deletion
					b++;
				}else if(b+1< B.length() && a+1< A.length() && A.charAt(a+1) == B.charAt(b+1) ){
					// Replacement
					a++;
					b++;
				}else{
					// Insertion
					a++; 
				}
			}
			
		}
		
		return CHANGES>=0;
		
				
	}

}

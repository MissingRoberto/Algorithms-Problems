package arraysnstrings;

public class CheckRotation {

	public static boolean isRotation(String s1, String s2){
		if (s1.length() != s2.length())
			return false;
		
		
		int LENGTH = s1.length();
		
		if (LENGTH == 0)
			return true; 
		
		StringBuilder x = new StringBuilder();
		StringBuilder y = new StringBuilder();
		boolean found = false; 
		int i = 0;
		int j = 0;
		
		while(j < LENGTH){
			char c = s2.charAt(j);
			
			if (s1.charAt(i) == c){
				found = true;
				x.append(c);
				i++;	
			}else {
				if(found){
					found = false; 
					y.append(x.chars());
					x = new StringBuilder();
				}
				y.append(c);
			}
			j++; 
		}
		
		return found ? true :s1.contains(y.toString()); 
	}
}

package arraysnstrings;

public class CompressString {
	
	// Worst case O(N) in time and space 
	public static String compress(String s){
		
		if (s.length() == 0){
			return s;
		}
		
		int previous = -1; 
		int counter = 0;
		StringBuilder compressed = new StringBuilder();
		for (int i = 0; i < s.length(); i++){
			int new_char = s.charAt(i) - 'a';
			
			if ( new_char != previous){
				previous = new_char;
				if (counter > 0)
					compressed.append(counter);
				compressed.append(s.charAt(i));
				counter=1;
				if (compressed.length() + 1 > s.length()){
					return s;
				}
			}else{
				counter++;
			}
		}
		compressed.append(counter);
		
    	return compressed.toString();
	}

}

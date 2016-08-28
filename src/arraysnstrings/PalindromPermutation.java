package arraysnstrings;

import java.util.BitSet;
import java.util.HashMap;

public class PalindromPermutation {

	public static boolean isPalindromPermutationHash(String s){
		HashMap<String,Boolean> hash = new HashMap<String,Boolean>();
		for(int i=0; i< s.length();i++ ){
			String key = String.valueOf(s.charAt(i));
					
			if (! hash.containsKey(key)){
				hash.put(key, new Boolean(false));
			}
			hash.put(key, new Boolean(Boolean.logicalXor(hash.get(key),true)));
		}
		int limit = 1; 
		for (Boolean value: hash.values()){
			if (value.booleanValue()){
				limit--;
			}
			if (limit < 0)
				return false; 
		}
		return true; 
	}
	
	
	public static boolean isPalindromPermutationVector(String s){
		BitSet vector = new BitSet();
		
		for(int i=0; i< s.length();i++ ){
			int key = s.charAt(i) - 'a';
			vector.flip(key);
		}
		
		if (vector.cardinality() > 1 )
			return false;
		
		return true; 
	}
}

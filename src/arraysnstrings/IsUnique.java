package arraysnstrings;
import java.util.BitSet;

public class IsUnique {

	public static boolean isUniqueChars(String str) {
	    int checker = 0;
	    for (int i = 0; i < str.length(); ++i) {
	        int val = str.charAt(i) - 'a';
	        if ((checker & (1 << val)) > 0) return false;
	        checker |= (1 << val);
	    }
	    return true;
	}
	
	
	public static boolean isUniqueCharsBits(String str) {
	    BitSet bits = new BitSet();
	    for (int i = 0; i < str.length(); ++i) {
	        int val = str.charAt(i) - 'a';
	        if (bits.get(val)) return false;
	        bits.set(val);
	    }
	    return true;
	}
	
	
}

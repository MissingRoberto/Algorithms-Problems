package arraysnstrings;

public class IsAnagram {
	
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		int[] frequency = new int[26];
		
        for (char c : a.toCharArray())
            frequency[(int) c -'a']++;
        
        for (char c : b.toCharArray()) {
            frequency[(int) c - 'a']--;
            if (frequency[(int) c - 'a']< 0)
		    	return false;
        }
        
		for (int i = 0; i<frequency.length; i++)
			if (frequency[i] != 0)
				return false;
			
		
		return true;
	}
}

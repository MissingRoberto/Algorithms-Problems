package arraysnstrings;

public class NeedleHayStuck {

	
	int search(String pattern, String text) {
	    int[] lsp = buildPrefixTable	(pattern);
	    
	    int j = 0;  // Number of chars matched in pattern
	    for (int i = 0; i < text.length(); i++) {
	        while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
	            // Fall back in the pattern
	            j = lsp[j - 1];  // Strictly decreasing
	        }
	        if (text.charAt(i) == pattern.charAt(j)) {
	            // Next char matched, increment position
	            j++;
	            if (j == pattern.length())
	                return i - (j - 1);
	        }
	    }
	    
	    return -1;  // Not found
	}

	
	public int[] buildPrefixTable(String s) {
		int[] lsp = new int[s.length()];
		lsp[0] = 0; // Base case
		for (int i = 1; i < s.length(); i++) {
			// Start by assuming we're extending the previous LSP
			int j = lsp[i - 1];
			while (j > 0 && s.charAt(i) != s.charAt(j))
				j = lsp[j - 1];
			if (s.charAt(i) == s.charAt(j))
				j++;
			lsp[i] = j;
		}
		return lsp;
	}
}

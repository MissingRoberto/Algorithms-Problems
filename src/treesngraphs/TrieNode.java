package treesngraphs;

public class TrieNode {

	TrieNode[] children;
	boolean isWord;

	public TrieNode() {
		children = new TrieNode[26];
		isWord = false;
	}
	
	private static int popChar(StringBuilder sb){
		char c = sb.charAt(0); 
		sb.deleteCharAt(0);
		return c - 'a'; 
	}
	public boolean hasChild(int c){
		return children[c] != null;
	}

	public TrieNode getChild(int c){
		return children[c];
	}
	
	public void add(String word) {
		if (word.length() == 0)
			return;

		StringBuilder sb = new StringBuilder(word);
		int c = popChar(sb); 

		if (!hasChild(c))
			children[c] = new TrieNode();
			
		TrieNode child = getChild(c);
		
		if (sb.length() == 0)
			child.isWord = true;

		child.add(sb.toString());
	}

	public boolean contains(String word) {
		if (word.length() == 0)
			return false;
		
		StringBuilder sb = new StringBuilder(word);
		int c = popChar(sb); 
		
		if (!hasChild(c)) {
			return false;
		} else {
			TrieNode child = getChild(c);
			if (sb.length() == 0 && child.isWord)
				return true;
			else 
				return child.contains(sb.toString());
			
		}

	}

	public boolean startsWith(String prefix) {
		if (prefix.length() == 0)
			return false;
		
		StringBuilder sb = new StringBuilder(prefix);
		int c = popChar(sb); 
		
		if (!hasChild(c)) {
			return false;
		} else {
			if (sb.length() == 0) {
				return true;
			} else {
				TrieNode child = getChild(c);
				return child.startsWith(sb.toString());
			}
		}

	}

}

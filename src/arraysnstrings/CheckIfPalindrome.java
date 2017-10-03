package arraysnstrings;

import java.util.Scanner;

public class CheckIfPalindrome {

	// This needs O(N) in time plus O(N) in space. Easy but could be better in space.
	// We actually have to reverse the array and then check it, technically speaking would be something like O(2N)
	private static boolean isPalindromeFullReverse(String word){
		if (word.isEmpty())
			return false;
		
		StringBuilder builder = new StringBuilder(word);
		return builder.reverse().toString().equals(word);
	}
	
	
	// This needs O(N) in time and O(1) in space.
	
	private static boolean isPalindromeDoubleIndex(String word){
		if (word.isEmpty())
			return false;
		int i = 0;
		int j = word.length()-1;
		
		while (i <= j ){
			if (word.charAt(i) != word.charAt(j)){
				return false;
			}
			i++;j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String word = stdin.next();
		System.out.println(isPalindromeFullReverse(word)? "Yes" : "No");
		System.out.println(isPalindromeDoubleIndex(word)? "Yes" : "No");
	}
}

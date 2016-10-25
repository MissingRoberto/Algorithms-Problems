package treesngraphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AlienDictionary {

	public String alienOrder(String[] words) {
		HashMap<Character, ArrayList<Character>> relations = new HashMap<Character, ArrayList<Character>>();
		String[] remainingWords = Arrays.copyOfRange(words, 0, words.length);

		while (remainingWords.length > 0) {
			remainingWords = generateOrder(words, relations);
		}

		StringBuilder order = new StringBuilder();
		for (Character first : relations.keySet()) {
			StringBuilder group = new StringBuilder();
			ArrayList<Character> previous = relations.get(first);
			if (previous.isEmpty()) {
				group.append(first);
				for (Character second : relations.keySet()) {
					if (!second.equals(first)) {
						if (relations.get(second).contains(first)) {
							group.append(second);
						}

					}
				}
			}
			order.append(group);
		}
		return order.toString();

	}

	public String[] generateOrder(String[] words, HashMap<Character, ArrayList<Character>> relations) {
		ArrayList<String> remainingWords = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 0) {
				StringBuilder sb = new StringBuilder(words[i]);
				char first = sb.charAt(0);
				sb.deleteCharAt(0);
				if (relations.containsKey(first))
					relations.put(first, new ArrayList<Character>());
				if (sb.length() > 0)
					remainingWords.add(sb.toString());

				for (int j = i; j < words.length; j++) {
					if (words[j].length() > 0) {
						char second = words[j].charAt(0);
						ArrayList<Character> previous;
						if (relations.containsKey(second)) {
							previous = relations.get(second);

						} else {
							previous = new ArrayList<Character>();
						}

						previous.add(first);
						relations.put(second, previous);

					}
				}
			}
		}

		return remainingWords.toArray(new String[remainingWords.size()]);
	}

}

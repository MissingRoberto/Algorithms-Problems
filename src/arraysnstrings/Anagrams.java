package arraysnstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

	public static String sort(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public ArrayList<String>[] groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		for (String word : strs) {
			String key = sort(word);
			ArrayList<String> list;
			list = map.containsKey(key) ? map.get(key) : new ArrayList<String>();
			list.add(word);
			map.put(key, list);
		}

		return (ArrayList<String>[]) map.values().toArray();
	}

}

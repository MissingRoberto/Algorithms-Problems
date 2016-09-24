package arraysnstrings;

public class CheckRotation {

	public static boolean isRotation(String s1, String s2){
		if (s1.length() != s2.length())
			return false;
		// s1=xy & s2=yx & s1 + s1 = xyxy = x+ s2 + y
		String s1s1= s1+s1;
		return s1s1.contains(s2);
	}
}

package code.recursion.string;

import java.util.ArrayList;
import java.util.List;

public class Ascii {

	public static void main(String[] args) {

		System.out.println(getAllSubSets("", "abc"));
	
	}

	static List<String> getAllSubSets(String p, String up) {
		if (up.isEmpty()) {
			List<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		List<String> left = getAllSubSets(p + ch, up.substring(1));
		List<String> right = getAllSubSets(p, up.substring(1));
		List<String> ascii = getAllSubSets(p + (ch + 0), up.substring(1));
		left.addAll(right);
		left.addAll(ascii);
		return left;
	}

	
}

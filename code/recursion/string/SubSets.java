package code.recursion.string;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

	public static void main(String[] args) {
		System.out.println(getAllSubSets("", "abc"));
	}

	static void getAllSubSets(String p, String up, List<String> list) {
		if (up.isEmpty()) {
			list.add(p);
			return;
		}
		char ch = up.charAt(0);
		getAllSubSets(p + ch, up.substring(1), list);
		getAllSubSets(p, up.substring(1), list);
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
		left.addAll(right);
		return left;
	}
}

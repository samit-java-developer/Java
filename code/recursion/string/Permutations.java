package code.recursion.string;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {

		// getPermutationsOfString("", "abc");
		System.out.println(getPermutationsOfString2("", "abc"));
		System.out.println(getPermutationsCount("", "abc"));
	}

	static void getPermutationsOfString(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		for (int i = 0; i <= p.length(); i++) {
			getPermutationsOfString(p.substring(0, i) + ch + p.substring(i), up.substring(1));
		}
	}

	static List<String> getPermutationsOfString2(String p, String up) {
		if (up.isEmpty()) {
			List<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		List<String> list1 = new ArrayList<String>();
		for (int i = 0; i <= p.length(); i++) {
			list1.addAll(getPermutationsOfString2(p.substring(0, i) + ch + p.substring(i), up.substring(1)));
		}
		return list1;
	}

	static int getPermutationsCount(String p, String up) {
		if (up.isEmpty()) {
			return 1;
		}
		char ch = up.charAt(0);
		int count = 0;
		for (int i = 0; i <= p.length(); i++) {
			count += getPermutationsCount(p.substring(0, i) + ch + p.substring(i), up.substring(1));
		}
		return count;
	}
}

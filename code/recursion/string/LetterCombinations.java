package code.recursion.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		
		System.out.println(letterCombinations("", "23", map));
		
 	}

	public static List<String> letterCombinations(String p, String digits, Map<String, String> map) {
		if (digits.isEmpty()) {
			List<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		String ch = digits.charAt(0) + "";
		String possibleOption = map.get(ch);
		int n = possibleOption.length();
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			result.addAll(letterCombinations(p + possibleOption.charAt(i), digits.substring(1), map));
		}
		return result;
	}

}

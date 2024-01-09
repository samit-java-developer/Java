package code.recursion.string;

public class Stream {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("");
		String result = skip("baccappled");
		System.out.println(result);
	}

	static String removeAllAFromGivenSting(String input, StringBuilder str) {
		if (input.length() == 0) {
			return str.toString();
		}
		char ch = input.charAt(0);
		if (ch != 'a') {
			str.append(ch);
		}
		return removeAllAFromGivenSting(input.substring(1), str);
	}

	static String skip(String input) {
		if (input.length() == 0) {
			return "";
		}
		char ch = input.charAt(0);
		if (ch != 'a') {
			return ch + skip(input.substring(1));
		} else {
			return skip(input.substring(1));
		}
	}

	static String skipApple(String input) {
		if (input.length() == 0) {
			return "";
		}
		if (input.startsWith("apple")) {
			return skipApple(input.substring(5));
		} else {
			return input.charAt(0) + skipApple(input.substring(1));
		}
	}

	static String skipAppNotApple(String input) {
		if (input.length() == 0) {
			return "";
		}
		if (input.startsWith("app") && !input.startsWith("apple")) {
			return skipAppNotApple(input.substring(3));
		} else {
			return input.charAt(0) + skipAppNotApple(input.substring(1));
		}
	}

}

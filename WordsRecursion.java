public class WordsRecursion {

	public static String removeLetter(String s, char c) {
		return removeLetterHelper(0, s, c);
	}

	public static String removeLetterHelper(int i, String s, char c) {
		if(i < s.length()) {
			if(s.charAt(i) == c) {
				return removeLetterHelper(i, s.substring(0,i) + "" + s.substring(i+1), c);
			} else {
				return removeLetterHelper(i+1, s, c);
			}
		} else {
			return s;
		}
	}

	public static boolean isAbecedarian(String s) {
		if(s.length() <= 1) {
			return true;
		}
		if(s.charAt(0) > s.charAt(1)) {
			return false;
		}
	 	return isAbecedarian(s.substring(1));
	}

	public static String generateRandWordHelper(int i,int x) {
		if(i < x) {
			return (char)(97 + 26 * Math.random()) + generateRandWordHelper(i + 1, x);
		} else {
			return "";
		}
	}

	public static String generateRandWord(int x) {
		return generateRandWordHelper(0,x);
	}


	public static int isopsephyHelper(int i, String s) {
		if(i < s.length()) {
			return s.charAt(i) - 96 + isopsephyHelper(i+1, s);
		} else {
			return 0;
		}
	}

	public static int isopsephy(String s) {
		return isopsephyHelper(0,s);
	}

	public static double avgIsopsephy(String[] words) {
		return avgIsopsephyHelper(0, words) / words.length;
	}

	public static double avgIsopsephyHelper(int i, String[] words) {
		if(i < words.length) {
			return isopsephy(words[i]) + avgIsopsephyHelper(i+1, words);
		} else {
			return 0.0;
		}
	}

	public static String reverseStringHelper(int i, String s) {
		if(i < s.length() && i >= 0) {
			return s.charAt(i) + reverseStringHelper(i-1, s);
		} else {
			return "";
		}
	}

	public static String reverseString(String s) {
		return reverseStringHelper(s.length()-1, s);
	}

	public static void main(String[] args) {
		System.out.println(removeLetter("asdfghsassaaaaeaaa", 'a'));
		System.out.println(isAbecedarian("abdest"));
		System.out.println(generateRandWord(5));
		System.out.println(isopsephy("abcde"));
		String[] words = {"abcd", "abcde", "abcdef"};
		System.out.println(avgIsopsephy(words));
		System.out.println(reverseString("Apple"));
	}
}

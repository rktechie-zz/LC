// Try to do this using recursion

public class Problem28 {

	public static void main(String[] args) {
		int t = strStr("mississippi", "issi");
		System.out.println(t);
	}

	public static int strStr(String haystack, String needle) {
		int index = 0;
		int j = 0;
		
		if(haystack.length() == 0 && needle.length() == 0)
			return 0;
		if(haystack.length() < needle.length())
			return -1;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			index = i;
			for (j = 0; j < needle.length(); j++) {
				if (haystack.charAt(index) != needle.charAt(j)) {
					break;
				}
				index++;
			}
			if (j == needle.length()) {
				return i;
			}
		}
		
		return -1;
	}
}

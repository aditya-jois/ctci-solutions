public class RemoveDuplicates {
	
	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		System.out.println(rd.removeDuplicateCharacters("aabbccdd"));
		System.out.println(rd.removeDuplicates1("aabbccdd".toCharArray()));
		System.out.println(rd.removeDuplicates2("aabbccdd".toCharArray()));
	}
	
	public String removeDuplicateCharacters(String value) {
		if (null == value) {
			return value;
		}
		if (value.length() < 2) {
			return value;
		}
		StringBuilder sb = new StringBuilder();
		boolean[] unique = new boolean[256];
		for (int i = 0; i < value.length(); i++) {
			int number = value.charAt(i);
			if (!unique[number]) {
				sb.append(value.charAt(i));
			}
			unique[number] = true;
		}
		return sb.toString();
	}
	
	/*
	 * Time Complexity: O(N^2)
	 */
	public char[] removeDuplicates1(char[] str) {
		if (null == str) {
			return str;
		}
		int len = str.length;
		if (len < 2) {
			return str;
		}
		int tail = 1;
		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		for (int k = tail;; k++) {
			str[k] = 0;
			if (k == len - 1) {
				break;
			}
		}
		return str;
	}
	
	/*
	 * A better solution
	 */
	public char[] removeDuplicates2(char[] str) {
		if (null == str) {
			return str;
		}
		int len = str.length;
		if (len < 2) {
			return str;
		}
		boolean[] hit = new boolean[256];
		hit[str[0]] = true;
		int tail = 1;
		for (int i = 0; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		for (int j = tail;; j++) {
			str[j] = 0;
			if (j == len - 1) {
				break;
			}
		}
		return str;
	}

}

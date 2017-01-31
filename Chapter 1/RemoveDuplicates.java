public class RemoveDuplicates {
	
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
	public void removeDuplicates1(char[] str) {
		if (null == str) {
			return;
		}
		int len = str.length;
		if (len < 2) {
			return;
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
		str[tail] = 0;
	}
	
	/*
	 * A better solution
	 */
	public void removeDuplicates2(char[] str) {
		if (null == str) {
			return;
		}
		int len = str.length;
		if (len < 2) {
			return;
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
		str[tail] = 0;
	}

}

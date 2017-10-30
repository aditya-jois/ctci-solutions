// Method to perform basic string compression

public class Problem5 {

	public static void main(String[] args) {
		String badString = "aabcccccaaa";
		char compare = badString.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < badString.length(); i++) {
			if (compare == badString.charAt(i)) {
				count += 1;
			} else {
				sb.append(compare).append(count);
				compare = badString.charAt(i);
				count = 1;
			}
		}
		sb.append(compare).append(count);
		if (sb.length() > badString.length()) {
			System.out.println(badString);
		} else {
			System.out.println(sb.toString());
		}
	}

}

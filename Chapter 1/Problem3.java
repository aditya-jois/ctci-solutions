import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		String one = new String("abcd");
		String two = new String("badc");
		Problem3 p3 = new Problem3();
		System.out.println(p3.permutation(one, two));
		System.out.println(p3.permutationBetter(one, two));
	}
	
	public boolean permutation(String one, String two) {
		return sort(one).equals(sort(two));
	}
	
	private String sort(String unsorted) {
		if (null == unsorted) {
			return "";
		}
		char[] content = unsorted.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public boolean permutationBetter(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] letters = new int[256];
		for (int  i = 0; i < s.length(); i++) {
			int value = s.charAt(i);
			letters[value]++;
		}
		for (int i = 0; i < t.length(); i++) {
			int value = t.charAt(i);
			if (--letters[value] < 0) {
				return false;
			}
		}
		return true;
	}

}

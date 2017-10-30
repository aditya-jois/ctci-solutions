// Method to reverse a null-terminated string
public class Reverse {

	public static void main(String[] args) {
		String toReverse = "abcd\0";
		char[] reversed = new char[toReverse.length()];
		System.out.println(toReverse);
		for (int i = toReverse.length() - 1, j = 0; i >= 0; i--,j++) {
			reversed[i] = toReverse.charAt(j);
		}
		for (int i = 0; i < reversed.length; i++) {
			System.out.print(reversed[i]);
		}
	}
	
	public String reverse1(String toReverse) {
		StringBuilder reversed = new StringBuilder();
		for (int i = toReverse.length() - 1; i >= 0; i--) {
			reversed.append(toReverse.charAt(i));
		}
		return reversed.toString();
	}
	
	public char[] reverseInPlace(char[] toReverse) {
		if (null == toReverse) {
			return toReverse;
		}
		int length = toReverse.length;
		if (length == 1) {
			return toReverse;
		}
		for (int i = 0, j = length - 1; i < length / 2; i++,j--) {
			char temp = toReverse[i];
			toReverse[i] = toReverse[j];
			toReverse[j] = temp;
		}
		return toReverse;
	}

}

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

}

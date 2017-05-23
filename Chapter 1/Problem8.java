public class Problem8 {

	public static void main(String[] args) {
		String one = "waterbottle";
		String two = "erbottlewat";
		System.out.println(isRotation(one, two));
	}
	
	public static boolean isRotation(String one, String two) {
		if (one.length() == two.length() && one.length() > 0) {
			two = two + two;
			return isSubstring(one, two);
		}
		return false;
	}
	
	public static boolean isSubstring(String one, String two) {
		return one.contains(two) || two.contains(one);
	}

}

// Method to replace all spaces with '%20'

public class Problem4 {

	public static void main(String[] args) {
		String input = "Mr John Smith";
		int extraSpaceCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				extraSpaceCount++;
			}
		}
		int newLength = input.length() + extraSpaceCount * 2;
		char[] inputArray = new char[newLength];
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == ' ') {
				inputArray[newLength - 1] = '0';
				inputArray[newLength - 2] = '2';
				inputArray[newLength - 3] = '%';
				newLength -= 3;
			} else {
				inputArray[newLength - 1] = input.charAt(i);
				newLength -= 1;
			}
		}
		System.out.println(inputArray);
	}

}

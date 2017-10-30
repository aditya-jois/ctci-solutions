// Algorithm to determine if a string has all unique characters; without additional data structures

//Refer http://www.asciitable.com/

	/**
	 * Time Complexity: O(n); n = value.length();
	 * Space Complexity: O(1)
	 * Applicable to ASCII character set.
	 * @param value
	 * @return
	 */
	public boolean hasUniqueCharactersASCII(String value) {
		//ASCII character set has 256 characters.  If it has more than 256 characters, they cannot be unique; return false
		if (value.length() > 256) return false;
		//Since we cannot use additional data structures, we need to rely on a boolean array to keep track of uniqueness
		//By default the boolean array gets initialized to it's default value i.e. false
		boolean[] unique = new boolean[256];
		//Iterate through the value provided
		for (int i = 0; i < value.length(); i++) {
			//Notice the char to int conversion which will be used to check the boolean array
			int number = value.charAt(i);
			//This will initially be false
			if (unique[number]) {
				//If found to be true, it means that there is a duplicate; return false
				return false;
			}
			//Set the flag in the boolean array to true for a character found to keep track
			unique[number] = true;
		}
		//If here, it means that value has unique characters; return true
		return true;
	}
  
	/**
	 * Time Complexity: O(n); n = value.length();
	 * Space Complexity: Reduced by a factor of 8 by using a bit vector
	 * Applicable to ASCII character set lower case characters a-z
	 * For A-Z and 0-9, one would need more checkers
	 * @param value
	 * @return
	 */
	public boolean hasUniqueCharacters(String value) {
		//ASCII character set has 256 characters.  If it has more than 256 characters, they cannot be unique; return false
		if (value.length() > 256) return false;
		//Flag used to verify uniqueness
		int checker = 0;
		//Iterate through the value provided
		for (int i = 0; i < value.length(); i++) {
			//Notice the char to int conversion and offset by char 'a' i.e. 97
			int number = value.charAt(i) - 'a';
			//Notice the bit left shift operator and the result being compared to checker with bitwise AND
			if ((checker & (1 << number)) > 0) {
				//If found to be true, it means that there is a duplicate; return false
				return false;
			}
			//bitwise OR operator assignment
			checker |= (1 << number);
		}
		//If here, it means that value has unique characters; return true
		return true;
	}

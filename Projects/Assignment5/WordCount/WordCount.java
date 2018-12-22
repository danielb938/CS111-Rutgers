public class WordCount {
	public static void main(String[] args) {
		System.out.println(countWords("  Gree$tin3gs   my  v   frie@n$d?", 6));
	}

	public static int countWords (String original, int maxLength) {

		int words = 0;
		int letterCount = 0; 
		String lettersAllowed = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	


		//Loop for counting Words
		for (int i = 0; i < original.length(); i++ ) {

			char c = original.charAt(i);

			if (Character.isLetter(c) && lettersAllowed.indexOf(c) >=0 ) {
				letterCount = letterCount + 1;
			}
			if (c == ' ' || i == original.length() - 1) {
				if (letterCount <= maxLength && letterCount >= 1) {
					words++;
				}
				letterCount = 0;
			}

		}//end for loop
		return words; 
	}
}
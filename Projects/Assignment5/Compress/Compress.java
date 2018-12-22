public class Compress {
	public static void main(String[] args) {
		System.out.println(compress("qqqqwwwwww"));
	}

	public static String compress (String original) {

		int x = 1;
		String newString = "";

		for (int i = 0; i < original.length(); i++) {
			char c = original.charAt(i); 

			if (i + 1 != original.length()) {
				if (c == original.charAt(i + 1)) {
					x++;
				}
				else {			
					if (x == 1) {
						newString = newString + c;
					}	
					else {
						newString = newString + (x + "") + c;
						x = 1;
					}
				}
			}
			if ((i + 1) == original.length()) {
				if (x == 1) {
						newString = newString + c;
				}
				else {
					newString = newString + (x + "") + c;
				}
			}
		}
		return newString;
	}
}
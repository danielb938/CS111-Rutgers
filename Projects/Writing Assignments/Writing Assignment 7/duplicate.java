public class duplicate {
	public static void main(String[] args) {
		String myString = "gigii";
		System.out.println(count(myString));
		System.out.println(myString.indexOf(myString.charAt(3)));
	}

	public static int count(String s) {
		//int count = 0;
		int countTotal = 0;

		for (int i = 0; i < s.length(); i++) {
			int count = 0; 
			if (i == s.indexOf(s.charAt(i))) {
					count++;
				}
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			countTotal = countTotal + count;
		}
		return countTotal;
	}
}
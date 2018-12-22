public class PigLatin {
	public static void main(String[] args) {
		System.out.println(translate("hello"));
		System.out.println(translate("yes"));
		System.out.println(translate("easy"));
		System.out.println(translate("Elephant")); //E != e?
		System.out.println(translate("Dinosaur"));
		System.out.println(translate("a"));
		System.out.println(translate("b"));
		System.out.println(translate(""));

	}

	public static String translate (String original) {
		//make sure string is not "" (empty string)
		if (original.length() == 0) {
			return original;
		}

		String newWord = "";
		
		char c = original.charAt(0);

		//String vowels = "aeiouAEIOU";

		/*
		if( vowels.indexOf(c) >= 0 )
		{
			// c is a vowel
		}
		else
		{
			// c is not a vowel
		}
		*/

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			newWord = original + "vai";
		}
		else {
			newWord = original.substring(1, original.length());
			newWord = newWord + original.charAt(0) + "ai";
			
			/*original = original.substring(1, original.length()); //we can do this because original is technically a variable but doesnt it get passed a string so how is it a variable ?
			newWord = original + "ai"; */
		}
		return newWord; 
	}  
}
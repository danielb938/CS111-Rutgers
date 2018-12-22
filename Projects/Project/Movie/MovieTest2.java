public class MovieTest2 {
	public static void main(String[] args) {
		//First Object
		Movie2 firstMovie = new Movie2("Monkey Boi", 2019, "Daniel", "funny", 5);
		
		//Second Object
		Movie2 secondMovie = new Movie2("Dat Boi", 2017, "Iri", "boring", 1);

		//Third Object
		Movie2 thirdMovie = new Movie2("Wolverine");

		//Fourth Object
		Movie2 fourthMovie = new Movie2("SpiderMan");

		//CompareTo 
		System.out.println(firstMovie.compareTo(secondMovie));
		System.out.println(thirdMovie.compareTo(fourthMovie));
		
		//Equals Method
		System.out.println(firstMovie.equals(secondMovie));
		System.out.println(thirdMovie.equals(fourthMovie));
	}
}
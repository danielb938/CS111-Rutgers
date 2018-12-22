public class MovieTest {
	public static void main(String[] args) {
		
		//First Object
		Movie firstMovie = new Movie("Titanic", 1998, "Steven", "boat", 5);

		//Second Object
		Movie secondMovie = new Movie("Titanic", 1998, "Steven", "boat", 5);

		//Third Object
		Movie thirdMovie = new Movie("Movie", 2018, "Jon", "boring", 1);

		//Fourth Object
		Movie fourthMovie = new Movie("Spider-Man", 2005, "Peter", "bug", 5);

		//Fifth Object
		Movie fifthMovie = new Movie("Up", 2009, "Disney", "balloon", 4);

		//Sixth Object
		Movie sixthMovie = new Movie("up");

		/*
		//Seventh Object
		Movie seventhMovie = new Movie();

		if (seventhMovie == null) {
			System.out.println("dfsdfsfsf");
		}
		*/

		//Test Cases
		System.out.println(firstMovie.compareTo(secondMovie));
		System.out.println(firstMovie.compareTo(thirdMovie));
		System.out.println(firstMovie.compareTo(fourthMovie));
		System.out.println(firstMovie.compareTo(fifthMovie));
		System.out.println(firstMovie.compareTo(sixthMovie));

		System.out.println(firstMovie.equals(secondMovie));
		System.out.println(firstMovie.equals(thirdMovie));
		System.out.println(firstMovie.equals(fourthMovie));
		System.out.println(firstMovie.equals(fifthMovie));
		System.out.println(firstMovie.equals(sixthMovie));
		//System.out.println(firstMovie.equals(seventhMovie));

		
		System.out.println(firstMovie.getName());
		firstMovie.setName("Inception");
		System.out.println(firstMovie.getName());
		System.out.println(firstMovie);


	}
}
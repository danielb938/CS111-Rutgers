public class Movie2 {

	//Instance Variables
	String name;
	int year;
	String director;
	String description;
	int ratings;

	public Movie2 (String movieName) {
		name = movieName;
	}

	//Test constructor
	public Movie2 (String movieName, int yearTest, String directorTest, String descriptionTest, int ratingsTest) {
		name = movieName;
		year = yearTest;
		director = directorTest;
		description = descriptionTest;
		ratings = ratingsTest;
	}

	//Getter Methods
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public String getDirector() {
		return director;
	}

	public String getDescription() {
		return description;
	}

	public int getRatings() {
		return ratings;
	}
	//Setter Methods
	public void setName(String newName) {
		name = newName;
	}

	public void setYear(int newYear) {
		year = newYear;
	}

	public void setDirector(String newDirector) {
		director = newDirector;
	}

	public void setDescription(String newDescription) {
		description = newDescription;
	}

	public void setRatings(int newRatings) {
		ratings = newRatings;
	}
	//toStringMethod
	public String toString() {
		return "Movie name: " + name + ", " + "Movie year: " + year + ", " + "Movie Rating " + ratings;
	}
	//Equals Method
	public boolean equals(Object other) {
		if (other == null || !(other instanceof Movie2)) {
			return false;
		}
		Movie2 m = (Movie2) other;
		return this.name.equals(m.getName()) && this.director == m.getDirector() && this.year == m.getYear();
	}
	//CompareTo Method
	public int compareTo (Movie2 other) {
		return name.compareTo(other.getName());
	}
}
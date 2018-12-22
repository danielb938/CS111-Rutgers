public class Movie {
	
	//Instance Variables
	String name;
	int year;
	String director;
	String description;
	int ratings;

	public Movie (String movieName) {
		name = movieName;
	}
	//Test constructor
	public Movie (String movieName, int yearTest, String directorTest, String descriptionTest, int ratingsTest) {
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
		if(other.getClass() == Movie.class) {
			
			Movie m = (Movie)other; //you had to move brackets because m is only in one if statement. You have to make it available in the other if statment
	
				if(this.name == m.name && this.director == m.director && this.year == m.year) {
					return true;
				}
		}
		return false; //you dont have "else" here because "return true" above stops the program 
	}

	//CompareTo Method
	public int compareTo(Movie m) {
		if (this.name.compareTo(m.name) == 0) {
			return 0;
		}
		else if (this.name.compareTo(m.name) < 0) {
			return -1;
		}
		else {
			return 1;
		}
	}
	public 
}
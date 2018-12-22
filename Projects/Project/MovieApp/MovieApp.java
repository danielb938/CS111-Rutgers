/*
 * 
 * This class implements a library of movies
 *
 * @author runb-cs111
 *
 */
public class MovieApp {

    private Movie[] items;     // keep movies in an unsorted array
    private int numberOfItems; // number of movies in the array
    /*
     * Default constructor allocates array with capacity for 20 movies
     */
    MovieApp () {
		items = new Movie[20];
    }
	
    /*
     * One argument constructor allocates array with user defined capacity
     *
     * @param capacity defines the capacity of the movie library
     */
    MovieApp (int capacity) {
		items = new Movie[capacity];
		//Movie[] items = new Movie[numberOfItems];
    }

    /*
     * Add a movie into the library (unsorted array)
     *
     * Inserts @m into the first empty spot in the array.
     * If the array is full (there is no space to add another movie)
     *   - create a new array with double the size of the current array
     *   - copy all current movies into new array
     *   - add new movie
     *
     * @param m The movie to be added to the libary
     *
     */
    public void addMovie (Movie m) {

    	for (int i = 0; i < items.length; i++) {

            if (items[i] == null) {
                items[i] = m;
                return;
            }
        }
        Movie[] newItemsSize = new Movie[2 * items.length];

        for (int i = 0; i < items.length; i++) {
            newItemsSize[i] = items[i];
        }
        newItemsSize[items.length] = m;
        items = newItemsSize;
    }


    /*
     * Removes a movie from the library. Returns true if movie is removed, false
     * otherwise.
     * The array should NOT become sparse after a remove, that is, all movies
     * should be in consecutive array indices.
     * 
     * @param m The movie to be removed
     * @return Returns true is movie is successfuly removed, false otherwise
     *
     */
    public boolean removeMovie (Movie m) {
	   for (int i = 0; i < items.length; i++) {
            if (items[i].equals(m)) {
                for (int j = i; j < items.length; j++) {
                    if (j + 1 != items.length) {
                        items[j] = items[j + 1];
                    }
                }
                items[items.length - 1] = null;
                return true;
            } 
       }
       return false;
    }
	// THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
	// Change as needed for your implementation
	//return false;

    /*
     * Returns the library of movies
     *
     * @return The array of movies
     */
    public Movie[] getMovies () {
	   return items;
	// THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
	// Change as needed for your implementation
	//return null;
    }

    /*
     * Returns the current number of movies in the library
     *
     * @return The number of items in the array
     */
    public int getNumberOfItems () {
	   int count = 0;
       for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                count++;
            }
        }
       return count;
    }
	// THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
	// Changed as needed for your implementation
	//return 0;
    
    /*
     * Update the rating of movie @m to @ratings
     * 
     * @param @m The movie to have its ratings updated
     * @param @ratings The new ratings of @m
     * @return tue if update is successfull, false otherwise
     *
     */
    public boolean updateRating (Movie m, int ratings) {
	   if (ratings > 5 || ratings <=0 ) {
            return false;
       }
       for (int i = 0; i < items.length; i++) {
            if (items[i].equals(m)) {
                m.setRatings(ratings);
                return true;
            }
       }
       return false;
    }
	// THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
	// Changed as needed for your implementation	
	//return false;
    
    /*
     * Prints all movies
     */
    public void print () {
	   for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i].toString());
            }
       }
    }

    /*
     * Return all the movies by @director. The array size should be the 
     * number of movies by @director.
     *
     * @param director The director's name
     * @return An array of all the movies by @director
     *
     */
    public Movie[] getMoviesByDirector (String director) {
        int count = 0; 
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if(items[i].getDirector().equals(director)) {
                    count++;
                }
            }
        }
        Movie[] directorCount = new Movie[count];

        int count2 = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if(items[i].getDirector().equals(director)) {
                    directorCount[count2] = items[i];
                    count2++;
                }
            }
        }
        return directorCount;
    }

	// THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
	// Changed as needed for your implementation	
	//return null;
    
    /*
     * Returns all the movies made in @year. The array size should be the
     * number of movies made in @year.
     *
     * @param year The year the movies were made
     * @return An array of all the movies made in @year
     *
     */
    public Movie[] getMoviesByYear (int year) {
	   int count = 0; 
       for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if(items[i].getYear() == year) { //the "items[i] != null" is needed because it check the slots 26 - the end of the array (which are null) so we have to loop through the array while the index is not null
                    count++;
                }
            }
        }

        Movie[] yearCount = new Movie[count];

        int count2 = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if(items[i].getYear() == year) {
                    yearCount[count2] = items[i];
                    count2++;
                }
            }
        }
        return yearCount;
    }

	// THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
	// Changed as needed for your implementation	
	//return null;
	
    /*
     * Returns all the movies with ratings greater then @ratings. The array
     * size should match the number of movies with ratings greater than @ratings
     *
     * @param ratings
     * @return An array of all movies with ratings greater than @ratings
     *
     */
    public Movie[] getMoviesWithRatingsGreaterThan (int ratings) {
        int max = ratings;
        int count = 0;

        //finds max value
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if (items[i].getRatings() > max) {
                    count++;
                }
            }
        }

        Movie[] maxCount = new Movie[count]; 

        //finds numerous max values
        int count2 = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if (items[i].getRatings() > max) {
                    maxCount[count2] = items[i];
                    count2++;
                }
            }   
        }
        return maxCount;
    }
	// THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
	// Changed as needed for your implementation	
	//return null;
}

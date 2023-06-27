package movies;

public class MoviesArray {
    public static Movie[] findAll() {
        // Code to return an array of Movie objects
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Frankenstein", "horror");
        movies[1] = new Movie("Goodfellas", "drama");
        movies[2] = new Movie("Pulp Fiction", "drama");
        // Add more movie objects as per your requirement
        return movies;
    }
}

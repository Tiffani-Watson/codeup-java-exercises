package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                case 1:
                    viewAllMovies();
                    break;
                case 2:
                    viewMoviesByCategory("animated");
                    break;
                case 3:
                    viewMoviesByCategory("drama");
                    break;
                case 4:
                    viewMoviesByCategory("horror");
                    break;
                case 5:
                    viewMoviesByCategory("scifi");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    private static void viewAllMovies() {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    private static void viewMoviesByCategory(String category) {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}

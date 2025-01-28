package linkedlist.doublylinkedlist.moviemanagementsystem;



public class Main {
    // Main method for testing
    public static void main(String[] args) {
        Movie mv = new Movie();

        // Adding movies
        mv.addAtEnd("Inception", "Christopher Nolan", 2010, 9.0);
        mv.addAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        mv.addAtPosition("Interstellar", "Christopher Nolan", 2014, 8.6, 1);

        // Displaying all movies
        System.out.println("Movies in Forward Order:");
        mv.displayForward();

        // Displaying movies in reverse order
        System.out.println("\nMovies in Reverse Order:");
        mv.displayReverse();

        // Searching for a movie
        System.out.println("\nSearching for movies by Christopher Nolan:");
        mv.searchByDirectorOrRating("Christopher Nolan", null);

        // Updating a movie's rating
        System.out.println("\nUpdating Rating for Inception:");
        mv.updateRatingByTitle("Inception", 9.5);
        mv.displayForward();

        // Deleting a movie
        System.out.println("\nDeleting Movie: The Godfather");
        mv.removeByTitle("The Godfather");
        mv.displayForward();

        // Checking the size of the list
        System.out.println("\nTotal Movies: " + mv.getSize());
    }
}

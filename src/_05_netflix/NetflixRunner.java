package _05_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie Shrek = new Movie("Shrek", 5);
		Movie Twilight = new Movie("Twilight", -3);
		Movie Endgame = new Movie("AvengersEndgame", 4);
		Movie BestMovie = new Movie("TheBestMovie", 1);
		Movie Potato = new Movie("Potato_TheMovie", 3);
		
		String twilight = Twilight.getTicketPrice();
		System.out.println(twilight);
		
		NetflixQueue q = new NetflixQueue();
		
		q.addMovie(BestMovie);
		q.addMovie(Twilight);
		q.addMovie(Endgame);
		q.addMovie(Potato);
		q.addMovie(Shrek);
		
		q.printMovies();
		
		System.out.println("The best movie is " + q.getBestMovie());
		q.sortMoviesByRating();
		System.out.println("The second best movie is " + q.getMovie(1));
		
	}
}

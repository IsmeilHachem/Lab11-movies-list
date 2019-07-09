import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		Movie m1 = new Movie("Liar Liar", "Comedy");
		Movie m2 = new Movie("Ace Ventura", "Comedy");
		Movie m3 = new Movie("Pineapple Express", "Comedy");
		Movie m4 = new Movie("Expendables", "Action");
		Movie m5 = new Movie("Saving Private Ryan", "Action");
		Movie m6 = new Movie("Halloween", "Horror");
		Movie m7 = new Movie("Chucky", "Horror");
		Movie m8 = new Movie("When Harry Met Sally", "RomCom");
		Movie m9 = new Movie("The Ugly Truth", "RomCom");
		Movie m10 = new Movie("We Were Soldiers", "Action");

		ArrayList<Movie> movies = new ArrayList<>();

		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		movies.add(m7);
		movies.add(m8);
		movies.add(m9);
		movies.add(m10);
//		movies[] = m1;
//		movies[1] = m2;
//		movies[2] = m3;
//		movies[3] = m4;
//		movies[4] = m5;
//		movies[5] = m6;
//		movies[6] = m7;
//		movies[7] = m8;
//		movies[8] = m9;
//		movies[9] = m10;

		/*
		 * String[] Comedy = { "Liar Liar", "Ace Ventura", "Pineapple Express" };
		 * String[] Action = { "Expendables", "Saving Private Ryan", "We Were Soldiers"
		 * }; String[] Horror = { "Halloween", "Chucky" }; String[] RomCom = {
		 * "When Harry Met Sally", "The Ugly Truth" };
		 */

		String choice = "";
		char userChoice = 0;

		do {
			System.out.println("Welcome to the Movie List Application!\n");
			System.out.println("There are 10 movies in this list.");
			System.out.println("What category are you intrested in?");
			choice = scnr.nextLine();
			System.out.println(choice);

			for (Movie movie : movies) {

				if (choice.equalsIgnoreCase("Comedy")) {

					if (choice.equalsIgnoreCase(movie.getCategory())) {

						System.out.println(movie.getTitle());

					}

				} else if (choice.equalsIgnoreCase("Action")) {

					if (choice.equalsIgnoreCase(movie.getCategory())) {

						System.out.println(movie.getTitle());

					}
				} else if (choice.equalsIgnoreCase("Horror")) {

					if (choice.equalsIgnoreCase(movie.getCategory())) {

						System.out.println(movie.getTitle());

					}
				} else if (choice.equalsIgnoreCase("RomCom")) {

					if (choice.equalsIgnoreCase(movie.getCategory())) {

						System.out.println(movie.getTitle());

					}
				}
			}

			System.out.println("Wanna pick another movie or nah? (y/n)");
			userChoice = scnr.next().charAt(0);
		} while (userChoice == 'Y' || userChoice == 'y');

		System.out.println("Aight I see how it is...");

		scnr.close();

	}

}

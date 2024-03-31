import java.util.Scanner;

public class MovieTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Movie movie = new Movie("Fast and Furious 1 ", "PG-13", 0, 0, 0, 0, 0, 0);
        System.out.println("-----Evaluation About " + movie.getMovieName() + "-----");
        System.out.println("Vote Degree:\n" + "1-Terrible\n" + "2-Bad\n" + "3-OK\n" + "4-Good\n" + "5-Great\n");


        while (movie.getVoteCounter() != 20) {
            System.out.println("Enter Your Vote: ");
            movie.addRating((input.nextInt()));
            input.nextLine();

        }
        movie.getAverage();
        input.close();
    }

}


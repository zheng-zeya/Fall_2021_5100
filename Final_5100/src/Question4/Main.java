package Question4;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Date date1 = new GregorianCalendar(1999, Calendar.FEBRUARY, 11).getTime();
        Date date2 = new GregorianCalendar(1998, Calendar.FEBRUARY, 21).getTime();
        Date date3 = new GregorianCalendar(2017, Calendar.FEBRUARY, 13).getTime();
        Date date4 = new GregorianCalendar(1983, Calendar.FEBRUARY, 25).getTime();
        Date date5 = new GregorianCalendar(2001, Calendar.FEBRUARY, 28).getTime();
        Date date6 = new GregorianCalendar(2020, Calendar.FEBRUARY, 15).getTime();
        Date date7 = new GregorianCalendar(2012, Calendar.FEBRUARY, 25).getTime();
        Movie movie1 = new Movie("movie1", date1);
        Movie movie2 = new Movie("movie2", date2);
        Movie movie3 = new Movie("movie3", date3);
        Movie movie4 = new Movie("movie4", date4);
        Movie movie5 = new Movie("movie5", date5);
        Movie movie6 = new Movie("movie6", date6);
        Movie movie7 = new Movie("movie7", date7);
        Date year2000 = new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime();
        Date year1990 = new GregorianCalendar(1990, Calendar.FEBRUARY, 1).getTime();

        Genre Romantic = new Genre("Romantic");
        Genre Suspicious = new Genre("Suspicious");
        Romantic.addMovie(movie1);
        Romantic.addMovie(movie2);
        Romantic.addMovie(movie3);
        Romantic.addMovie(movie4);
        Suspicious.addMovie(movie5);
        Suspicious.addMovie(movie6);
        Suspicious.addMovie(movie7);

        ArrayList<Movie> Allmovies = new ArrayList<>();
        Allmovies.add(movie1);
        Allmovies.add(movie2);
        Allmovies.add(movie3);
        Allmovies.add(movie4);
        Allmovies.add(movie5);
        Allmovies.add(movie6);
        Allmovies.add(movie7);

        Netflix netflix = new Netflix("Netflix");
        List<Genre> generes = new ArrayList<>();
        generes.add(Romantic);
        generes.add(Suspicious);
        netflix.genres.addAll(generes);

        System.out.println("Add Classic ===============");
        netflix.genres.stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleaseDate().before(year2000))
                .forEach(movie -> System.out.println("Classic".concat(movie.getTitle())));

        System.out.println("Latest 3 movies===================");
        netflix.genres.stream()
                .flatMap(genre -> genre.getMovies().stream())
                .sorted((m1, m2) -> m2.getReleaseDate().compareTo(m1.getReleaseDate())).limit(3)
                .forEach(movie -> System.out.println("Classic".concat(movie.getTitle())));

        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(year1990);
        Predicate<Movie> before2000 = movie -> movie.getReleaseDate().before(year2000);

        printTheListByYearRange(Allmovies, "=====Between 1990 and 2000====== ", after1990, before2000);

        System.out.println("======Add release year in the title======");
        Function<Movie, String> addYearToTitle = (Movie movie) -> {
            return movie.getReleaseDate() + movie.getTitle();
        };
        System.out.println(addYearToTitle.apply(movie1));

        System.out.println("===========Comparator==========");
        Collections.sort(Allmovies, (m1, m2) -> m1.getTitle().compareTo(m2.getTitle()));
        for (Movie m: Allmovies) {
            System.out.println( m.getTitle());
        }

    }

    private static void printTheListByYearRange(ArrayList<Movie> movieList, String movieByYearRange, Predicate<Movie> yearRange1, Predicate<Movie> yearRange2) {
        System.out.println(movieByYearRange);
        for (Movie movie : movieList) {
            if (yearRange1.test(movie) && yearRange2.test(movie)) {
                System.out.println("movie name: " + movie.getTitle() + " years:" + movie.getReleaseDate());
            }
        }
    }
}





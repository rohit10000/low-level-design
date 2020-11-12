import construction.City;
import construction.Movie;
import user.Customer;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie.Builder().setName("Sholey").setGenre("Action").setCast("Amitabh").setCast("Dharmendra")
                .setCast("Hema").setCast("Jaya").build();
        movie.showInfo();

        City city = new City.Builder().setName("Mirzapur").setLatitude("26 N").setLongitude("82.5 E").build().setMovie("Ashique 2")
                .setMovie("Don");
        city.showInfo();
    }
}

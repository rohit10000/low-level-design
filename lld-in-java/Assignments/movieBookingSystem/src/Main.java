import booking.Booking;
import booking.Payment;
import construction.*;
import user.Customer;
import user.User;

import java.util.*;

public class Main {
    static Movie movie;
    static Cast cast;
    static City city;
    static Theatre theatre;
    static TheatreHall theatreHall;
    static TheatreHallSeat theatreHallSeat;
    static MovieShow movieShow;
    static CustomerShowSeat customerShowSeat;
    static User user;
    private static void initialize(){
        movie = null;
        cast = null;
        city = null;
        theatreHallSeat = null;
        theatre = null;
        theatreHall = null;
        movieShow = null;
        customerShowSeat = null;
    }
    private static void logout(){
        user = null;
    }

    public static void main(String[] args) {

        Map<String , City> cityList = new HashMap<String, City>();
        Map<String, User> userList = new HashMap<String, User>();
        //City
        City mumbai = new City.Builder().setName("mumbai").setLatitude("12.22").setLongitude("13.11").build();
        cityList.put(mumbai.getName(), mumbai);
        City mirzapur = new City.Builder().setName("mirzapur").setLatitude("1.02").setLongitude("42.22").build();
        cityList.put(mirzapur.getName(), mirzapur);

        //Cast
        Cast amitabh = new Cast.Builder().setName("amitabh").setAge(72).setGender("male").build();
        Cast shahrukh = new Cast.Builder().setName("shahrukh").setAge(52).setGender("male").build();

        //Movie
        Movie sholey = new Movie.Builder().setName("sholey").setGenre("action").setCast(amitabh).build();
        sholey.setCity(mumbai.getName(), mumbai);
        sholey.setCity(mirzapur.getName(), mirzapur);

        mumbai.setMovie(sholey.getName(), sholey);
        mirzapur.setMovie(sholey.getName(), sholey);

        Movie fauji = new Movie.Builder().setName("fauji").setGenre("action").setCast(shahrukh).build();
        fauji.setCity(mirzapur.getName(), mirzapur);
        fauji.setCity(mumbai.getName(), mumbai);
        mumbai.setMovie(fauji.getName(), fauji);
        mirzapur.setMovie(fauji.getName(), fauji);

        //Theatre
        Theatre chandauli = new Theatre.Builder().setName("chandauli").setPlace("chandauli").setCity(mirzapur).build();
        mirzapur.setTheatre(chandauli.getName(), chandauli);

        Theatre goregaun = new Theatre.Builder().setName("goregaun").setPlace("goregaun").setCity(mumbai).build();
        mumbai.setTheatre(goregaun.getName(), goregaun);

        //TheatreHall
        TheatreHall xeon = new TheatreHall.Builder().setName("xeon").setTheatre(chandauli).build();
        chandauli.setHall(xeon.getName(), xeon);

        TheatreHall mercury = new TheatreHall.Builder().setName("mercury").setTheatre(goregaun).build();
        goregaun.setHall(mercury.getName(), mercury);

        //TheatreHallSeat
        TheatreHallSeat frontx = new TheatreHallSeat.Builder().setType("normal").setHallSeatPrice(120).setColumn(1)
                .setRow(1).setTheatreHall(xeon).setName("frontx").build();
        xeon.setSeat(frontx.getName(), frontx);

        TheatreHallSeat middlex = new TheatreHallSeat.Builder().setType("balcony").setHallSeatPrice(160).setColumn(11)
                .setRow(11).setTheatreHall(xeon).setName("middlex").build();
        xeon.setSeat(middlex.getName(), middlex);

        TheatreHallSeat frontm = new TheatreHallSeat.Builder().setType("normal").setHallSeatPrice(200).setColumn(1)
                .setRow(1).setTheatreHall(xeon).setName("frontm").build();
        mercury.setSeat(frontm.getName(), frontm);

        TheatreHallSeat middlem = new TheatreHallSeat.Builder().setType("balcony").setHallSeatPrice(260).setColumn(11)
                .setRow(11).setTheatreHall(xeon).setName("middlem").build();
        mercury.setSeat(middlem.getName(), middlem);

        //User
        User rohit = new Customer.Builder().setName("rohit").setEmail("rohits@gmail.com")
                .setPhoneNumber("1234567890").build();
        userList.put(rohit.getName(), rohit);

        //User console can be build from here
        logout();
        System.out.println("Welcome to Movie Booking System!");
        Scanner sc;
        while(true){
            initialize();
            sc = new Scanner(System.in); // why I have to declare it inside loop, I am recreating an scanner object every time
            // inside loop because if I was creating it only once outside of while loop, then after one iteration
            // it was giving null exception. I don't know why.

            if(user != null){
                System.out.println("Select 1.Proceed to movie booking, 2.logout");
                Integer choice = sc.nextInt();
                if(choice == 1){
                }
                else if(choice == 2){
                    logout();
                    continue;
                }
                else{
                    System.out.println("Invalid choice!");
                    continue;
                }
            }
            //select City

            System.out.println("Choose the city");
            System.out.println("Select the city 1.mumbai, 2.mirzapur");

            String cityKey = sc.nextLine();
            city = cityList.get(cityKey);
            Map<String, Movie> movieMap = city.getMovie();
            //select the movie

            System.out.println("Choose the movie");
            for(String key: movieMap.keySet()){
                System.out.println(movieMap.get(key).getName());
            }
            while(true){
                String movieKey = sc.nextLine();
                if(movieMap.containsKey(movieKey)){
                    movie = movieMap.get(movieKey);
                    break;
                }
                else{
                    System.out.println("Movie not found!");
                    continue;
                }
            }

            Map<String , Theatre> theatreList = city.getTheatre();
            // select the theatre
            System.out.println("Choose the theatre");

            for(String key: theatreList.keySet()){
                System.out.println(key);
            }

            String theatreKey = sc.nextLine();

            theatre = theatreList.get(theatreKey);
            Map<String, TheatreHall> theatreHallList = theatre.getHall();

            //select the theatreHalls
            System.out.println("Choose the theatreHall");
            for (String key: theatreHallList.keySet()){
                System.out.println(key);
            }
            String theatreHallKey = sc.nextLine();

            theatreHall = theatreHallList.get(theatreHallKey);
            Map<String, TheatreHallSeat> theatreHallSeatList = theatreHall.getSeat();

            //created Movieshow automatically
            System.out.println("created Movieshow automatically");

            movieShow = new MovieShow.Builder().setMovie(movie).setStartTime("1200hrs").setEndTime("1430hrs")
                    .setShowPrice(100).setTheatreHall(theatreHall).build();

            //select the theatreHallSeats
            System.out.println("Choose the theatreHallSeat");
            for (String key: theatreHallSeatList.keySet()){
                System.out.println(key);
            }


            String theatreHallSeatKey = sc.nextLine();

            theatreHallSeat = theatreHallSeatList.get(theatreHallSeatKey);

            //select for booking
            System.out.println("Choose 1 for booking ticket and 2 for Return to home");
            String choice = sc.nextLine();
            switch(choice){
                case "1":
                    if(user == null){
                        // created customerShowSeat automatically
                        while(true){
                            System.out.println("Login using your userName");
                            String userKey = sc.nextLine();
                            if(userList.containsKey(userKey)){
                                user = userList.get(userKey);
                                break;
                            }
                            else
                                System.out.println("User not found. Try another user!");
                        }


                    }
                    // created customerShowSeat automatically
                    System.out.println("created customerShowSeat automatically");
                    customerShowSeat = new CustomerShowSeat.Builder().setMovieShow(movieShow)
                            .setTheatreHallSeat(theatreHallSeat).build();

                    //Create booking object
                    Booking booking = new Booking.Builder().setCustomerShowSeat(customerShowSeat)
                            .setCustomer(user).build();

                    Map<String, String> bookingInfo = booking.getBookingInfo();
                    for(String key: bookingInfo.keySet()){
                        System.out.println(key+": "+bookingInfo.get(key));
                    }
                    while (true){
                        System.out.println("Proceed to payment. Choose 1. yes or 2. no!");
                        Integer proceed = sc.nextInt();

                        if(proceed == 1){
                            System.out.println(Payment.initiatePayment());
                            System.out.println("Booked Successful!");
                            break;
                        }
                        else if(proceed == 2){
                            System.out.println("Payement cancelled. Redirecting to home..");
                            break;
                        }
                        else{
                            System.out.println("Wrong choice!");
                            continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}

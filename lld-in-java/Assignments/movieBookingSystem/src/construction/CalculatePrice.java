package construction;

public class CalculatePrice {
    public static float calculateShowSeatPrice(MovieShow show, TheatreHallSeat seat){
        return show.getShowPrice() + seat.getHallSeatPrice();
    }
}

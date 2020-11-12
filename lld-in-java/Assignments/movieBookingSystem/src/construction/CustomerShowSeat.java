package construction;

public class CustomerShowSeat{
    float price;
    boolean isResearve = false;
    MovieShow show;
    TheatreHallSeat theatreHallSeat;

    CustomerShowSeat(Builder obj){
        this.show = obj.show;
        this.theatreHallSeat = obj.theatreHallSeat;
    }
    public static class Builder{
        MovieShow show;
        TheatreHallSeat theatreHallSeat;
        public Builder setMovieShow(MovieShow obj){
            this.show = obj;
            return this;
        }
        public Builder setTheatreHallSeat(TheatreHallSeat seat){
            this.theatreHallSeat = seat;
            return this;
        }
        public CustomerShowSeat build(){
            CustomerShowSeat showSeat = new CustomerShowSeat(this);
            return showSeat;
        }

    }
    public CustomerShowSeat setPrice(float price){
        this.price = price;
        return this;
    }
    public CustomerShowSeat reserveSeat(){
        isResearve = true;
        return this;
    }
    public CustomerShowSeat freeSeat(){
        isResearve = false;
        return this;
    }

    public float getPrice(){
        return this.getShowSeatPrice(show, theatreHallSeat);
    }
    public boolean isResearved(){
        return isResearve;
    }

    //methods

    public float getShowSeatPrice(MovieShow show, TheatreHallSeat seat){
        return CalculatePrice.calculateShowSeatPrice(show, seat);
    }

    public MovieShow getShow() {
        return this.show;
    }
    public TheatreHallSeat getTheatreHallSeat() {
        return this.theatreHallSeat;
    }
}

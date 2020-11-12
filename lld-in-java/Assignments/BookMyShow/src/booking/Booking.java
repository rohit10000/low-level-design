package booking;

import java.sql.Time;

public class Booking {
    String bookingTime;
    Booking(Builder obj){
        this.bookingTime = obj.bookingTime;
    }
    public static class Builder{
        String bookingTime;
        public Builder setBookingTime(String time){
            this.bookingTime = time;
            return this;
        }
        public Booking build(){
            Booking booking = new Booking(this);
            return booking;
        }
    }
}

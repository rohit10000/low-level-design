package booking;

import construction.CustomerShowSeat;
import user.Customer;
import user.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String bookingTime;
    CustomerShowSeat customerShowSeat;
    User user;

    Booking(Builder obj){
        this.customerShowSeat = obj.customerShowSeat;
        this.user = obj.user;
        setBookingTime();
    }

    private void setBookingTime(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        this.bookingTime = dateFormat.format(date);
    }
    public static class Builder {
        String bookingTime;
        CustomerShowSeat customerShowSeat;
        User user;

        public Builder setCustomerShowSeat(CustomerShowSeat obj) {
            this.customerShowSeat = obj;
            return this;
        }
        public Builder setCustomer(User obj) {
            this.user = obj;
            return this;
        }

        public Booking build() {
            Booking booking = new Booking(this);
            return booking;
        }
    }
    //getter method

    public String getBookingTime() {
        return bookingTime;
    }
    public String getMovieName(){
        return this.customerShowSeat.getShow().getMovie().getName();
    }
    public String getStartTime(){
        return this.customerShowSeat.getShow().getStartTime();
    }
    public String getEndTime(){
        return this.customerShowSeat.getShow().getEndTime();
    }
    public String getPrice(){
        return String.valueOf(this.customerShowSeat.getPrice());
    }
    //methods
    public Map<String, String> getBookingInfo(){
        Map<String, String> bookingInfo = new HashMap<String, String>();

        bookingInfo.put("Customer Name", user.getName());
        bookingInfo.put("Booked at", this.getBookingTime());
        bookingInfo.put("Price", this.getPrice());
        bookingInfo.put("Movie Name", this.getMovieName());
        bookingInfo.put("Starting Time", this.getStartTime());
        bookingInfo.put("Ending Time", this.getEndTime());


        return bookingInfo;
    }
}

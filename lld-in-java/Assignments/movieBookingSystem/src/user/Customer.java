package user;

import booking.Booking;
import construction.CustomerShowSeat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends User{

    Customer(Builder obj){
        super(obj);
    }

    public static class Builder{
        String name, email, phoneNumber;
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber){
            this.email = email;
            return this;
        }
        public Customer build(){
            Customer customer = new Customer(this);
            return customer;
        }
    }
    public void payForShowTicket(){}
    public void cancelShowTicket(){}
    public void seeBookingLog(){}

}

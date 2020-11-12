package user;

import booking.Booking;

public class Admin extends User{

    Admin(Builder obj){
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
        public Admin build(){
            Admin admin = new Admin(this);
            return admin;
        }
    }
    public void updateTheatre(){

    }
    public void updateTheatreHall(){

    }
    public void updateTheatreSeat(){

    }

    public void blockCustomer(){

    }
    public void unblockCustomer(){

    }
}

package construction;

import java.util.ArrayList;
import java.util.List;

public class TheatreHall {
    String name;
    Integer numberOfSeat;
    List<String> seat;

    TheatreHall(Builder obj){
        this.name = obj.name;
        this.numberOfSeat = obj.numberOfSeat;
        this.seat = obj.seat;
    }

    public static class Builder{
        String name;
        Integer numberOfSeat;
        List<String> seat;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setNumberOfSeat(int n){
            this.numberOfSeat = n;
            return this;
        }
        public Builder seat(String seat){
            if(this.seat == null)
                this.seat = new ArrayList<String>();
            this.seat.add(seat);
            return this;
        }
        public TheatreHall build(){
            TheatreHall theatreHall = new TheatreHall(this);
            return theatreHall;
        }
    }

    public TheatreHall setHall(String seat){
        if(this.seat == null)
            this.seat = new ArrayList<String>();
        this.seat.add(seat);
        return this;
    }

    public String getName(){
        return this.name;
    }
    public Integer getNumberOfSeat(){
        return this.numberOfSeat;
    }
    public List<String> getSeat(){
        return this.seat;
    }

    //other methods
}

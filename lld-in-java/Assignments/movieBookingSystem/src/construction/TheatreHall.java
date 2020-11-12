package construction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreHall {
    String name;
    Integer numberOfSeat;
    Map<String, TheatreHallSeat> seat = new HashMap<String, TheatreHallSeat>();
    Theatre theatre;

    TheatreHall(Builder obj){
        this.name = obj.name;
        this.theatre = obj.theatre;
    }

    public static class Builder{
        String name;
        Theatre theatre;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setTheatre(Theatre obj){
            this.theatre = obj;
            return this;
        }
        public TheatreHall build(){
            TheatreHall theatreHall = new TheatreHall(this);
            return theatreHall;
        }
    }

    public TheatreHall setSeat(String seatName, TheatreHallSeat obj){
        this.seat.put(seatName, obj);
        return this;
    }
    public TheatreHall incrementSeat(){
        this.numberOfSeat = this.numberOfSeat + 1;
        return this;
    }
    public TheatreHall decrementSeat(){
        this.numberOfSeat = this.numberOfSeat - 1;
        return this;
    }

    public String getName(){
        return this.name;
    }
    public Integer getNumberOfSeat(){
        return this.numberOfSeat;
    }
    public Map<String, TheatreHallSeat> getSeat(){
        return this.seat;
    }
    public Theatre getTheatre(){
        return this.theatre;
    }

    //other methods
}

package construction;

import java.util.ArrayList;
import java.util.List;

public class TheatreHallSeat {
    String type;
    String name;
    Integer row, column;
    TheatreHall theatreHall;
    Integer hallSeatPrice;


    TheatreHallSeat(Builder obj){
        this.type = obj.type;
        this.name = obj.name;
        this.row = obj.row;
        this.column = obj.column;
        this.theatreHall = obj.theatreHall;
        this.hallSeatPrice = obj.hallSeatPrice;
    }

    public static class Builder{
        String type;
        String name;
        Integer row, column;
        TheatreHall theatreHall;
        Integer hallSeatPrice;

        public Builder setType(String type){
            this.type = type;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setRow(Integer row){
            this.row = row;
            return this;
        }
        public Builder setColumn(Integer col){
            this.column = col;
            return this;
        }
        public Builder setTheatreHall(TheatreHall obj){
            this.theatreHall = obj;
            return this;
        }
        public  Builder setHallSeatPrice(Integer price){
            this.hallSeatPrice = price;
            return this;
        }
        public TheatreHallSeat build(){
            TheatreHallSeat theatreHallSeat = new TheatreHallSeat(this);
            return theatreHallSeat;
        }
    }

    public String getType(){
        return this.type;
    }
    public Integer getRow(){
        return this.row;
    }
    public Integer getColumn(){
        return this.column;
    }
    public String getName(){
        return this.name;
    }
    public Integer getHallSeatPrice(){
        return this.hallSeatPrice;
    }
    public TheatreHall getTheatreHall() {
        return theatreHall;
    }

    //other methods
}

package construction;

import java.util.ArrayList;
import java.util.List;

public class TheatreHallSeat {
    String type;
    Integer row, column;

    TheatreHallSeat(Builder obj){
        this.type = obj.type;
        this.row = obj.row;
        this.column = obj.column;
    }

    public static class Builder{
        String type;
        Integer row, column;

        public Builder setType(String type){
            this.type = type;
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

    //other methods
}

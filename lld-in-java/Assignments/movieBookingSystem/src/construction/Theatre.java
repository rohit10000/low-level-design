package construction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theatre {
    String name, place;
    Integer numberOfHall = 0;
    Map<String, TheatreHall> hall = new HashMap<String, TheatreHall>();
    City city;

    Theatre(Builder obj){
        this.name = obj.name;
        this.place = obj.place;
        this.city = obj.city;
    }

    public static class Builder{
        String name, place;
        City city;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setPlace(String place){
            this.place = place;
            return this;
        }
        public Builder setCity(City city){
            this.city = city;
            return this;
        }
        public Theatre build(){
            Theatre theatre = new Theatre(this);
            return theatre;
        }
    }
    public Theatre incrementHall(){
        this.numberOfHall = this.numberOfHall + 1;
        return this;
    }
    public Theatre decrementHall(){
        this.numberOfHall = this.numberOfHall - 1;
        return this;
    }
    public Theatre setHall(String hallName, TheatreHall obj){
        this.hall.put(hallName, obj);
        return this;
    }

    public String getName(){
        return this.name;
    }
    public String getPlace(){
        return this.place;
    }
    public Integer getNoOfHall(){
        return this.numberOfHall;
    }
    public Map<String, TheatreHall> getHall(){
        return this.hall;
    }
    public City getCity(){
        return this.city;
    }

    //other methods
    public void showInfo() {
        System.out.println(this.getName()+" is a theatre situated at "+this.getPlace()+" with a total of "+this.getNoOfHall()
                +" halls");
    }

}

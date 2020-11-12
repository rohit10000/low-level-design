package construction;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    String name, place;
    Integer numberOfHall;
    List<String> hall;

    Theatre(Builder obj){
        this.name = obj.name;
        this.place = obj.place;
        this.numberOfHall = obj.numberOfHall;
        this.hall = obj.hall;
    }

    public static class Builder{
        String name, place;
        Integer numberOfHall;
        List<String> hall;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setPlace(String place){
            this.place = place;
            return this;
        }
        public Builder setNumberOfHalls(Integer n){
            this.numberOfHall = n;
            return this;
        }
        public Builder setHall(String hall){
            this.hall.add(hall);
            return this;
        }
        public Theatre build(){
            Theatre theatre = new Theatre(this);
            return theatre;
        }
    }

    public Theatre setMovie(String hall){
        if(this.hall == null)
            this.hall = new ArrayList<String>();

        (this.hall).add(hall);
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
    public List<String> getHall(){
        return this.hall;
    }

    //other methods
    public void showInfo() {
        System.out.println(this.getName()+" is a theatre situated at "+this.getPlace()+" with a total of "+this.getNoOfHall()
                +" halls");
    }

}

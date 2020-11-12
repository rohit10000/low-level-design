package construction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    String name, latitude, longitude;
    Map<String , Movie> movie = new HashMap<String, Movie>();
    Map<String, Theatre> theatre = new HashMap<String, Theatre>();

    //constructor for city class
    City(Builder obj){
        this.name = obj.name;
        this.longitude = obj.longitude;
        this.latitude = obj.latitude;
    }

    //Builder class for city
    public static class Builder{
        String name, latitude, longitude;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setLatitude(String lat){
            this.latitude = lat;
            return this;
        }
        public Builder setLongitude(String lon){
            this.longitude = lon;
            return this;
        }
        public City build(){
            City city = new City(this);
            return city;
        }
    }

    //setter function for CityMovie : Because it can be used multiple times even apart from at the time of obj creation.
    public void setMovie(String movieName, Movie movie){
        this.movie.put(movieName, movie);
    }
    public void setTheatre(String theatreName, Theatre theatre){
        this.theatre.put(theatreName, theatre);
    }

    //getter function for City
    public String getName(){
        return this.name;
    }
    public String getLatitude(){
        return this.latitude;
    }
    public String getLongitude(){
        return this.longitude;
    }
    public Map<String, Movie> getMovie(){
        return this.movie;
    }
    public Map<String, Theatre> getTheatre(){
        return this.theatre;
    }

    //other methods
    public void showInfo() {
        System.out.print(this.name +"is a wonderful city and is situated at "+this.latitude+" latitude and "
        + this.longitude+" longitude with the following movie collection: ");
        for(int i=0; i<this.movie.size(); i++){
            System.out.print(this.movie.get(i)+", ");
        }
        System.out.println();
    }

}

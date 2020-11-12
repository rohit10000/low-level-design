package construction;

import java.util.*;

public class Movie {
    String name, genre;
    List<Cast> cast;
    Map<String, City> city = new HashMap<String, City>();

    Movie(Builder obj){
        this.name = obj.name;
        this.genre = obj.genre;
        this.cast = obj.cast;
    }

    public static class Builder{
        String name, genre;
        List<Cast> cast = new ArrayList<Cast>();

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setGenre(String genre){
            this.genre = genre;
            return this;
        }
        public Builder setCast(Cast obj){
            (this.cast).add(obj);
            return this;
        }
        public Movie build(){
            Movie movie = new Movie(this);
            return movie;
        }
    }

    public void setCity(String cityName, City obj){
        (this.city).put(cityName, obj);
    }

    public String getName(){
        return this.name;
    }
    public String getGenre(){
        return this.genre;
    }
    public List<Cast> getCast(){
        return this.cast;
    }
    public Map<String, City> getCity(){
        return this.city;
    }

    public void showInfo() {
        System.out.print(this.name +" is of "+this.genre+" genre and its cast members are: ");
        for(int i=0; i<cast.size(); i++){
            System.out.print(cast.get(i).getName()+", ");
        }
        System.out.println();
    }




}

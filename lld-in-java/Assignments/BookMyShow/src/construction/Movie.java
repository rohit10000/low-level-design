package construction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Movie {
    String name, genre;
    List<String> cast;
    List<String> city;

    Movie(Builder obj){
        this.name = obj.name;
        this.genre = obj.genre;
        this.cast = obj.cast;
    }

    public static class Builder{
        String name, genre;
        List<String> cast;
        List<String> city;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setGenre(String genre){
            this.genre = genre;
            return this;
        }
        public Builder setCast(String cast){
            if(this.cast == null)
                this.cast = new ArrayList<String>();

            (this.cast).add(cast);
            return this;
        }
        public Movie build(){
            Movie movie = new Movie(this);
            return movie;
        }
    }

    public Movie setCity(String city){
        if(this.city == null)
            this.city = new ArrayList<String>();

        (this.city).add(city);
        return this;
    }
    public String getName(){
        return this.name;
    }
    public String getGenre(){
        return this.genre;
    }
    public List<String> getCast(){
        return this.cast;
    }
    public List<String> getCity(){
        return this.city;
    }
    public void showInfo() {
        System.out.print(this.name +" is of "+this.genre+" genre and its cast members are: ");
        for(int i=0; i<cast.size(); i++){
            System.out.print(cast.get(i)+", ");
        }
        System.out.println();
    }




}

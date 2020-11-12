package construction;

public class MovieShow {
    String startTime, endTime;
    Movie movie;
    TheatreHall hall;
    Integer showPrice;

    MovieShow(Builder obj){
        this.startTime = obj.startTime;
        this.endTime = obj.endTime;
        this.movie = obj.movie;
        this.hall = obj.hall;
        this.showPrice = obj.showPrice;
    }

    public static class Builder{
        String startTime, endTime;
        Movie movie;
        TheatreHall hall;
        Integer showPrice;

        public Builder setStartTime(String startTime){
            this.startTime = startTime;
            return this;
        }
        public Builder setEndTime(String endTime){
            this.startTime = endTime;
            return this;
        }
        public Builder setMovie(Movie obj){
            this.movie = obj;
            return this;
        }
        public Builder setShowPrice(Integer price){
            this.showPrice = price;
            return this;
        }
        public Builder setTheatreHall(TheatreHall obj){
            this.hall = obj;
            return this;
        }
        public MovieShow build(){
            MovieShow movieShow = new MovieShow(this);
            return movieShow;
        }
    }
    public String getStartTime(){
        return this.startTime;
    }
    public String getEndTime(){
        return this.endTime;
    }
    public Integer getShowPrice(){
        return this.showPrice;
    }
    public Movie getMovie(){
        return this.movie;
    }
    public TheatreHall getTheatreHall(){
        return this.hall;
    }

}

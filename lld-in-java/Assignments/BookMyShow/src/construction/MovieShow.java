package construction;

public class MovieShow {
    String startTime, endTime;

    MovieShow(Builder obj){
        this.startTime = obj.startTime;
        this.endTime = obj.endTime;
    }

    public static class Builder{
        String startTime, endTime;

        public Builder setStartTime(String startTime){
            this.startTime = startTime;
            return this;
        }
        public Builder setEndTime(String endTime){
            this.startTime = endTime;
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
}

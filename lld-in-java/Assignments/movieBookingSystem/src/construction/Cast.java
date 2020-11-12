package construction;

public class Cast {
    String name, gender;
    Integer age;
    //constructor of Cast
    Cast(Builder obj){
        this.name = obj.name;
        this.gender = obj.gender;
        this.age = obj.age;
    }
    //set a function for cast class
    public static class Builder{
        String name, gender;
        Integer age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Cast build() {
            Cast cast = new Cast(this);
            return cast;
        }
    }

    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public Integer getAge() {
        return this.age;
    }

}

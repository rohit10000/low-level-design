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

        public void setName(String name) {
            this.name = name;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public void setAge(Integer age) {
            this.age = age;
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

public class Bird {
    String name, color, gender;
    Bird(Builder obj){
        this.name = obj.name;
        this.color = obj.color;
        this.gender = obj.gender;
    }
    public void showInfo(){
        System.out.println("Name: "+this.name+", Color: "+this.color+" and Gender: "+this.gender);
    }
    public static class Builder {
        String name, color, gender;
        public Builder setName(String n){
            this.name = n;
            return this;
        }
        public Builder setColor(String c){
            this.color = c;
            return this;
        }
        public Builder setGender(String g){
            this.gender = g;
            return this;
        }
        public Bird build(){
            Bird b = new Bird(this);
            return b;
        }

    }
}

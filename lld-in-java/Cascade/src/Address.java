public class Address {
    String pincode, country;

    public Address(Builder obj){
        this.pincode = obj.pincode;
        this.country = obj.country;
    }
    public void showInfo(){
        System.out.println("Pincode is "+this.pincode+" and country is "+this.country);
    }
    public static class Builder{
        String pincode, country;
        public Builder setPincode(String p){
            this.pincode = p;
            return this;
        }
        public Builder setCountry(String c){
            this.country = c;
            return this;
        }

        public Address build(){
            Address add = new Address(this);
            return add;
        }
    }
}

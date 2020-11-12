package user;

public class User {
    String name, email, phoneNumber;

    public User setName(String name){
        this.name = name;
        return this;
    }
    public User setEmail(String email){
        this.email = email;
        return this;
    }
    public User setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}

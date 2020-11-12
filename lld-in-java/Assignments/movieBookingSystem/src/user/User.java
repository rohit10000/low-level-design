package user;

public class User {
    String name, email, phoneNumber;

    User(Admin.Builder obj){
        this.name = obj.name;
        this.email = obj.email;
        this.phoneNumber = obj.phoneNumber;
    }
    User(Customer.Builder obj){
        this.name = obj.name;
        this.email = obj.email;
        this.phoneNumber = obj.phoneNumber;
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

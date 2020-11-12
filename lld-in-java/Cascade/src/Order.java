import java.util.List;

public class Order {

    public static void main(String[] args) {
        Address addr = new Address.Builder().setPincode("221010").setCountry("India").build();
        addr.showInfo();

        boolean res = Validation.validateAdd(ValidationCascadeFactory.getInstance(addr).getAddrMapping(addr.country));


        if(res)
            System.out.println("Address is valid");
        else
            System.out.println("Address is not valid");
    }
}

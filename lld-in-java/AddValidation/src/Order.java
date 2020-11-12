public class Order {
    public static void main(String[] args) {
        Address add = new Address.Builder().setPincode("221010").setCountry("India").build();
        add.showInfo();

        Boolean res = Validation.Addvalidation(add);
        if(res)
            System.out.println("Address is valid");
        else
            System.out.println("Address is not valid");
    }
}

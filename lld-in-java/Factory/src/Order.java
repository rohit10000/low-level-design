public class Order {

    public static void main(String[] args) {
        Address addr = new Address.Builder().setPincode("221010").setCountry("India").build();
        addr.showInfo();

        boolean res = false;

        Validation x = AddrValidationFactory.getInstance(addr)
                .getAddValidation(addr.country);

        if(x !=null){
            res =  x.validate(addr);
        }
        else
            System.out.println("CountryCodeNotFound");


        if(res)
            System.out.println("Address is valid");
        else
            System.out.println("Address is not valid");
    }
}

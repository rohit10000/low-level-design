public class Validation {

     public static boolean Addvalidation(Address addr){

        return (zipValidation.validate(addr.pincode) && countryValidation.validate(addr.country));
     }
}

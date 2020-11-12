public class USAddvalidation extends Validation {
    static public boolean validate(Address addr){
        return USzipValidation.validate(addr.pincode) && UScountryValidation.validate(addr.country);
    }
}

import java.util.Set;

public class INAddvalidation implements Validation {

    public boolean validate(Address addr){
        return INzipValidation.validate(addr.pincode)
                && INcountryValidation.validate(addr.country);
    }

}

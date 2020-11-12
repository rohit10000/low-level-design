import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ValidationCascadeFactory {
    Map<String, List<Validation>> countryToValidation;
    static ValidationCascadeFactory r = null;

    private ValidationCascadeFactory(Address addr){
        countryToValidation.put("India", Arrays.asList(new INzipValidation(addr.pincode),
                new INcountryValidation(addr.country)));

        countryToValidation.put("US", Arrays.asList(new USzipValidation(addr.pincode),
                new UScountryValidation(addr.country)));
    }


    public static ValidationCascadeFactory getInstance(Address addr){
        if(r == null)
            r = new ValidationCascadeFactory(addr);

        return r;
    }

    public List<Validation> getAddrMapping(String s){
        if(countryToValidation.containsKey(s))
            return countryToValidation.get(s);
        else
            return null;

    }
}

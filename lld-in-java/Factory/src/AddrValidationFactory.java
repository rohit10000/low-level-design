import java.util.Map;

public class AddrValidationFactory {
    Map<String, Validation> countryToValidation;
    static AddrValidationFactory r = null;

    private AddrValidationFactory(){
        countryToValidation.put("India", new INAddvalidation());
        countryToValidation.put("US", new USAddvalidation());
    }

    public static AddrValidationFactory getInstance(Address addr){
        if(r == null)
            r = new AddrValidationFactory();

        return r;
    }

    public Validation getAddValidation(String s){
        if(countryToValidation.containsKey(s))
            return countryToValidation.get(s);
        else
            return null;

    }
}

import java.util.Set;

public class UScountryValidation extends USAddvalidation{
    String country;

    UScountryValidation(String country){
        this.country = country;
    }
    public boolean validate(){
        ResourceInitializer r = ResourceInitializer.getInitializer();
        Set<String > countrySet = r.getCountrySet();
        if(country.contains(country))
            return true;

        return false;

    }
}

import java.util.Set;

public class INcountryValidation extends INAddvalidation{

    String country;
    public INcountryValidation(String country){
        this.country = country;
    }

    public boolean validate() {
        ResourceInitializer r = ResourceInitializer.getInitializer();
        Set<String> countrySet = r.getCountrySet();
        if (country.contains(country))
            return true;

        return false;

    }
}

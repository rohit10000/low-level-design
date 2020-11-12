import java.util.Set;

public class INcountryValidation {

    public static boolean validate(String country) {
        ResourceInitializer r = ResourceInitializer.getInitializer();
        Set<String> countrySet = r.getCountrySet();
        if (country.contains(country))
            return true;

        return false;

    }
}

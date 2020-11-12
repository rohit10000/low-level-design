import java.util.Set;

public class ResourceInitializer {
    static ResourceInitializer r = null;

    Set<String > zipCoder;
    Set<String> countrySet;
    private ResourceInitializer(){
        //create connection
        //db.query
        //close
        //initializer
    }
    public static ResourceInitializer getInitializer() {
        if (r == null)
            r = new ResourceInitializer();
        return r;
    }
    public Set<String > getZipCoder(){
        return zipCoder;
    }
    public Set<String > getCountrySet(){
        return countrySet;
    }
}

import java.util.Set;

public class USzipValidation {
    public static boolean validate(String pincode){
        ResourceInitializer r = ResourceInitializer.getInitializer();
        Set<String> zipCoder = r.getZipCoder();
        if(zipCoder.contains(pincode))
            return true;
        return false;
    }
}

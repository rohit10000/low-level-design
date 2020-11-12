import java.util.Set;

public class USzipValidation extends USAddvalidation{
    String pincode;
    USzipValidation(String pincode){
        this.pincode = pincode;
    }
    public boolean validate(){
        ResourceInitializer r = ResourceInitializer.getInitializer();
        Set<String> zipCoder = r.getZipCoder();
        if(zipCoder.contains(pincode))
            return true;
        return false;
    }
}

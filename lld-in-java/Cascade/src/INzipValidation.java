import java.util.List;
import java.util.Set;

public class INzipValidation extends INAddvalidation{
    String pincode;

    public INzipValidation(String pincode){
        this.pincode = pincode;
    }

    public boolean validate(){
        ResourceInitializer r = ResourceInitializer.getInitializer();
        Set<String> zipCoder = r.getZipCoder();
        if(zipCoder.contains(this.pincode))
            return true;
        return false;
    }
}

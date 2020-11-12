import java.util.List;

abstract class Validation {
    public abstract boolean validate();

    public static boolean validateAdd(List<Validation> l){
        for(Validation val: l){
            if(!val.validate())
                return false;
        }
        return true;
    }
}

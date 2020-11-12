package construction;

public class CustomerShowSeat {
    float price;
    boolean isResearve = false;

    public CustomerShowSeat setPrice(float price){
        this.price = price;
        return this;
    }
    public CustomerShowSeat reserveSeat(){
        isResearve = true;
        return this;
    }
    public CustomerShowSeat freeSeat(){
        isResearve = false;
        return this;
    }

    public float getPrice(){
        return this.price;
    }
    public boolean isResearved(){
        return isResearve;
    }
}

public class Main {
    public static void main(String[] args) {
        //Hen h = new Bird(); error: says Bird cannot be converted to Hen
        Bird h = new Hen();
        h.setPrice(120);
        Seller.sell(h);

        Bird e = new Eagle();
        e.setPrice(240);
        Seller.sell(e);
    }
}

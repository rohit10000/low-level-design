public class Main {
    public static void main(String[] args) {
        Bird obj = new Bird.Builder().setName("gauraiya")
                .setColor("brown")
                .setGender("female").build();
        obj.showInfo();
    }
}

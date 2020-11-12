import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main(String[] args) {
        MongoClient mongo = new MongoClient("127.0.0.1", 27017);
        System.out.println("Hello Rohit!");
        MongoCredential credential;
        credential = MongoCredential.createCredential("sampleUser", "myDb", "password".toCharArray());
        System.out.println("Connected to the database successfully");
        // Accessing the database
        MongoDatabase database = mongo.getDatabase("myDb");
        System.out.println("Database created!");
    }
}

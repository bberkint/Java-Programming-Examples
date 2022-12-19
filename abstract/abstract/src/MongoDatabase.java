public class MongoDatabase extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("Mongo güncelledi.");
    }

    @Override
    void get() {
        System.out.println("Mongo verileri aldı.");
    }
}

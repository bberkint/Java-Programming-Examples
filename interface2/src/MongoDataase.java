public class MongoDataase implements IDatabase{
    @Override
    public void add() {
        System.out.println("MongoDb ekleme");
    }

    @Override
    public void delete() {
        System.out.println("MongoDb silme");
    }

    @Override
    public void get() {
        System.out.println("MongoDb elde etme");
    }

    @Override
    public void update() {
        System.out.println("MongoDb güncelleme");
    }
}

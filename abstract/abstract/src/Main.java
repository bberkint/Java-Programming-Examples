public class Main {
    public static void main(String[] args) {

        AbstractDatabase mysqlDatabase = new MysqlDatabase();
        AbstractDatabase mongoDatabase = new MongoDatabase();

        mysqlDatabase.add();
        mongoDatabase.add();
        mysqlDatabase.update();
        mongoDatabase.update();
    }
}
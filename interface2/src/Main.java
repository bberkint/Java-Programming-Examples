public class Main {
    public static void main(String[] args) {
       DatabaseManager manager = new DatabaseManager();
       MysqlDatabase mysqlDatabase = new MysqlDatabase();

       manager.addDatabase(mysqlDatabase);
       manager.deleteDatabase(mysqlDatabase);

       
    }
}
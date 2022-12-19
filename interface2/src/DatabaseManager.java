public class DatabaseManager {

    public void addDatabase(IDatabase database){
        database.add();
    }

    public void updateDatabase(IDatabase database){
        database.update();
    }

    public void getDatabase(IDatabase database){
        database.get();
    }

    public void deleteDatabase(IDatabase database){
        database.delete();
    }

}

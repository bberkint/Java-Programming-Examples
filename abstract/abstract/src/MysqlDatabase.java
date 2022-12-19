public class MysqlDatabase extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("Mysql güncelledi.");
    }

    @Override
    void get() {
        System.out.println("Mysql verileri aldı.");
    }
}

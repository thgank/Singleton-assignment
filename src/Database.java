public class Database {

    private Database() {

    }

    private static final class InstanceHolder {
        private static final Database instance = new Database();
    }

    public static Database getInstance() {
        return InstanceHolder.instance;
    }

    public void test() {
        System.out.println("success");
    }
}
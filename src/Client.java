public class Client {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.test();

        Database secondDatabase = Database.getInstance();

        if (database.equals(secondDatabase)) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}
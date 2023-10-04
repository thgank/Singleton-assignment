public class ThreadCheck {
    public static void main(String[] args) {
        // create a task
        Runnable task = () -> {
            Database database = Database.getInstance();
            database.test();
        };

        // apply threads
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}

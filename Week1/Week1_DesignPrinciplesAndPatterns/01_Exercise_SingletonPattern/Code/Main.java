public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first log message : logger1");
        logger2.log("This is the second log message : logger2");

        if (logger1 == logger2) {
            System.out.println("Only one instance is used. Singleton verified!");
        } else {
            System.out.println("Different instances exist. Singleton failed!");
        }
    }
}

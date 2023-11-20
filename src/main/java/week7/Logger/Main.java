package week7.Logger;

public class Main {
    public static void main(String[] args) {
        Logger recordLogger = new RecordLogger("RecordLogger");
        Logger classLogger = new ClassLogger("ClassLogger");

        Runnable logWithRecordLogger = () -> recordLogger.logMessage("This is a message from RecordLogger");
        Runnable logWithClassLogger = () -> classLogger.logMessage("This is a message from ClassLogger");

        logWithRecordLogger.run();
        logWithClassLogger.run();
    }
}

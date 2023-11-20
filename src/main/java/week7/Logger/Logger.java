package week7.Logger;

interface Logger {
    void logMessage(String message);
}

record RecordLogger(String loggerName) implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println(loggerName + ": " + message);
    }
}

class ClassLogger implements Logger {
    private String loggerName;
    public ClassLogger(String loggerName) {
        this.loggerName = loggerName;
    }
    @Override
    public void logMessage(String message) {
        System.out.println(loggerName + ": " + message);
    }
}


interface Logger {
    void log(String message);
}
class LegacyLogger {
    public void legacyLog(String message) {
        System.out.println("Legacy Logger: " + message);
    }
}
class LegacyLoggerAdapter implements Logger {
    private LegacyLogger legacyLogger;

    public LegacyLoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void log(String message) {
        legacyLogger.legacyLog(message);
    }
}
public class AdapterPatternDemo {
    public static void main(String[] args) {
        LegacyLogger legacyLogger = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacyLogger);
        logger.log("This is a test log message.");
    }
}

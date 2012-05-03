import java.io.File;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestClass {
    public static void main(String[] args) throws IOException {
        new File("logs").mkdir();
        DateFormat dt = new SimpleDateFormat("yyyyMMddhhmmss");
        Date now = new Date();
        String date = dt.format(now);
        String logFileName = "logs/testlog-" + date + ".txt";
        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger scjaLogger = Logger.getLogger("SCJA Logger");
        scjaLogger.setLevel(Level.ALL);
        scjaLogger.addHandler(myFileHandler);
        scjaLogger.info("\nThis is a logged information message.");
        myFileHandler.close();
    }
}
import java.util.Date;
import java.text.SimpleDateFormat;

public class Logger {

  private static Logger logger;

  private Logger() {

  }

  public static synchronized Logger getInstance() { // getInstance method for singleton pattern

    if (logger == null) {

      logger = new Logger();
    }

    return logger;
  }

  public void print(Date date, String message) { // şimdilik string ile deneyelim
    System.out.println(new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SS").format(date) + " " + message);
  }

  public void error(Date date, String message) { // şimdilik string ile deneyelim
    System.err.println(new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SS").format(date) + " " + message);
  }
}

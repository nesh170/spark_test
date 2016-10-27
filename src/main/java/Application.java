import java.sql.Timestamp;
import java.util.Date;

import static spark.Spark.*;

public class Application {
    public static int myCounter = 0;

    public static void main(String[] args) {
        port(8080);
        get("/hello", (req, res) -> {
            String returnString;
            Date currentDate = new Date();
            Timestamp time = new Timestamp(currentDate.getTime());
            myCounter++;
            returnString = "Counter: " + myCounter + " Timestamp: " + time.toString();
            return returnString;
        });
    }
}
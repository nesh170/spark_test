import static spark.Spark.*;

public class Application {
    public static void main(String[] args) {
        port(8080);
        get("/hello", (req, res) -> "Hello World");
        get("/",((request, response) -> "Testing this website to see if it is lit\n"));
    }
}
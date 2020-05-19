package pizza_now;

public class Main {
    public static void main(String[] argv) throws Exception {
       new ApplicationServer(8080, new WelcomeServlet()).start();
    }
}

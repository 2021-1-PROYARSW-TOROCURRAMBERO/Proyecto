package edu.escuelaing.arsw;
import static spark.Spark.get;
import static spark.Spark.port;

import spark.Request;
import spark.Response;
public class QuickMobilityApp {
	public static void main(String[] args) {
		port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
	}
	private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<title>Quick Mobility</title>"
                + "<body style = \"background: url(https://delvinvillage.com/wp-content/uploads/2020/06/maintenance.png) no-repeat ; background-size: 100% 111%;\">"
                + "</body>"
                + "</html>";
        return pageContent;
    }
	static int getPort() {
	       if (System.getenv("PORT") != null) {
	           return Integer.parseInt(System.getenv("PORT"));
	       }
	       return 4567;
	}
}
package example;

import static spark.Spark.*;

public class LogService {

	public static void main(String[] args) {
		port(8080);
		
		get("/log", (request, response) -> {
			System.out.println("message: " + request.queryParams("m") + ", stacktrace: " + request.queryParams("s"));
			return "";
		});
	}
}

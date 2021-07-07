package quotes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connections {

  private static  final String GET_URL="https://favqs.com/api/qotd";



  public static void requestGet() throws IOException {

    URL obj = new URL(GET_URL);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    // set a GET request :
    con.setRequestMethod("GET");

    System.out.println(con);

  }
}

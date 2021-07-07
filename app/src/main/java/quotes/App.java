/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class App {
  private static  final String GET_URL="https://favqs.com/api/qotd";


  public static void main(String[] args) throws IOException {

//
//   readJsonFile();
//   Connections urlConnection = new Connections();
    requestGet();
  }


  public static void readJsonFile() throws IOException {

    BufferedReader  reader = Files.newBufferedReader(Paths.get("C:\\Users\\maria\\Desktop\\testJava\\quotes\\app\\src\\main\\resources\\recentquotes.json"));
//
//
    // make a List of type Quotes then
    //convert JSON array to list of users
    List<Quotes> users = new Gson().fromJson(reader, new TypeToken<List<Quotes>>() {}.getType());
    // select a random number of the indexes of the list and pick one:
    Random rand = new Random();
    System.out.println(users.get(rand.nextInt(users.size())));

    // if we want to print it all :
//    users.forEach(System.out::println);
    reader.close();
  }
  public static void requestGet() throws IOException {

    URL obj = new URL(GET_URL);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    // set the connection time out :
    con.setConnectTimeout(5000);
    con.setReadTimeout(5000);
    // set a GET request :
    con.setRequestMethod("GET");
    int responseCode = con.getResponseCode();
    // check if the response is OK 200 :
    if (responseCode==HttpURLConnection.HTTP_OK){
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
// read the data from the URL request :
      String data =in.readLine();
      System.out.println("the data has been read :  "+data);
      // close the connection :
      in.close();
      // convert JSON format :
      Gson gson = new Gson();
      webQuotes quoteee = gson.fromJson(data, webQuotes.class);
//
      System.out.println("all quotes : "+quoteee.quote.body);

//      System.out.println(">>>>>>>>>>>>>>>>>: >>> " + quoteee);
    }



//    System.out.println(con);

  }

  }






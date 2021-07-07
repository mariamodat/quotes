package quotes;

public class webQuotes {
  public String qotd_date;
  public quotesData quote ;





  public static class quotesData{
    public String body;
    public String author_permalink;

    public quotesData(String body) {
      this.body = body;
    }

    public String getAuthor_permalink() {
      return author_permalink;
    }

    public String getBody() {
      return body;
    }


  }


}

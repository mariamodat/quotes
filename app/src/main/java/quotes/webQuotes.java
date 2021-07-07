package quotes;

public class webQuotes {
  public String qotd_date;
  public Object quote ;



  @Override
  public String toString() {
    return "webQuotes{" +
      "qotd_date='" + qotd_date + '\'' +
      ", quote=" + quote +
      '}';
  }

  public  class quotesData{
    public String body;

    public quotesData(String body) {
      this.body = body;
    }

    public String getBody() {
      return body;
    }

    @Override
    public String toString() {
      return "quotesData{" +
        "body='" + body + '\'' +
        '}';
    }
  }


}

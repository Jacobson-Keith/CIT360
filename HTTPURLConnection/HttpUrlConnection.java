import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaHttpUrlConnectionReader
{
  public static void main(String[] args)
  throws Exception
  {
    new JavaHttpUrlConnectionReader();
  }
  
  public JavaHttpUrlConnectionReader()
  {
    try
    {
      String myUrl = "http://localhost:8080/";

      String results = doHttpUrlConnectionAction(myUrl);
      System.out.println(results);
    }
    catch (Exception e)
    {
    }
  }

  private String doHttpUrlConnectionAction(String desiredUrl)
  throws Exception
  {
    URL url = null;
    BufferedReader reader = null;
    StringBuilder stringBuilder;

    try
    {
      url = new URL(desiredUrl);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      
      connection.setRequestMethod("GET");
      
      connection.setDoOutput(true);

      connection.setReadTimeout(15*1000);
      connection.connect();

      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      stringBuilder = new StringBuilder();

      String line = null;
      while ((line = reader.readLine()) != null)
      {
        stringBuilder.append(line + "\n");
      }
      return stringBuilder.toString();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw e;
    }
    finally
    {
      if (reader != null)
      {
        try
        {
          reader.close();
        }
        catch (IOException ioe)
        {
          ioe.printStackTrace();
        }
      }
    }
  }
}

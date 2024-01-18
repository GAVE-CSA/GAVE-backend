import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;


public class NewsNowAPI {
    
    private static final String API_URL = "https://newsnow.p.rapidapi.com/news";
    private static final String API_KEY = "d2f7c75442mshde016465b174ed9p10a7b5jsn1acedf7fc107";  // Replace with your API key

    public String fetchData() {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("x-rapidapi-host", "newsnow.p.rapidapi.com");
            connection.setRequestProperty("x-rapidapi-key", API_KEY);

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String response = in.lines().collect(Collectors.joining());
                    return response;
                }
            } else {
                return "Failed to fetch data: " + responseCode;
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        NewsNowAPI fetcher = new NewsNowAPI();
        String data = fetcher.fetchData();
        System.out.println(data);
    }
}



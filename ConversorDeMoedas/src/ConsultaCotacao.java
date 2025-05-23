import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultaCotacao {
    public static ApiResponse obterCotacoes(String base) {
        try {
            String url_str = "https://v6.exchangerate-api.com/v6/adb146901ec4a0b5a275b09f/latest/" + base;
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            Gson gson = new Gson();
            return gson.fromJson(response.toString(), ApiResponse.class);
        } catch (Exception e) {
            System.out.println("Erro ao conectar na API: " + e.getMessage());
            return null;
        }
    }
}
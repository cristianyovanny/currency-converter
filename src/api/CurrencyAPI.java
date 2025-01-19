package api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyAPI {
    public String getAPI_URL(String baseCurrency, String quoteCurrency, Double amountCurrency) {
        try {
            // Setting URL
            String url_str = "https://v6.exchangerate-api.com/v6/1fb93ee3623af31e33a066db/pair/";

            // Making Request
            URI url = URI.create(url_str + "/" + baseCurrency + "/" + quoteCurrency + "/" + amountCurrency);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(url).build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            JsonElement jsonElement = JsonParser.parseString(response.body());
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            if (jsonObject.has("conversion_result")) {
                return jsonObject.get("conversion_result").getAsString();
            } else {
                throw new RuntimeException("Error: La API no devolvió un resultado válido. Respuesta: " + response.body());
            }
        } catch (Exception e){
            System.err.println("Error al obtener el cambio de moneda: " + e.getMessage());
            throw new RuntimeException("Error" + e.getMessage());
        }

    }

}

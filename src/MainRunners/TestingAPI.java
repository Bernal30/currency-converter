package MainRunners;

import Models.ConversionRateList;
import Models.Currency;
import Models.ExchangeRateList;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class TestingAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        //creamos una request a un servidor mediante HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //se coloca el link de la API request
                .uri(URI.create("https://v6.exchangerate-api.com/v6/4f4f950220bf969d1cbfd78a/latest/usd"))
                .build();

        //tenemos que resivir los datos del srevidor
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        //respuesta de la API en formato JSON
        String json = response.body();
        System.out.println("Formato en Json: " + json);

        //instancia de la libreria gson con politica upper camel case
        Gson gson = new Gson();

        //transformar de Json a una clase record con un Object como parametro
        ConversionRateList conversionRate = gson.fromJson(json, ConversionRateList.class);
        System.out.println("Resultado de convertir de Json a Clase Record: " + conversionRate);

        //el object de la clase Record pasa a la clase "ExchangeRateList"
        ExchangeRateList exchangeRateList = new ExchangeRateList(conversionRate, "Lista de Conversiones");
        




    }
}

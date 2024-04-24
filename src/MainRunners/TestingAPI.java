package MainRunners;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TestingAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        //creamos una request a un servidor mediante HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //se coloca el link de la API request
                .uri(URI.create("https://v6.exchangerate-api.com/v6/4f4f950220bf969d1cbfd78a/latest/mxn"))
                .build();

        //tenemos que resivir los datos del srevidor
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

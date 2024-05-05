package com.converter.MainRunners;

import com.converter.Models.ConversionRateList;
import com.converter.Models.ExchangeRateList;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TestingAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eliga uan divisa base para las conversiones: ");
        String userCurrency = scanner.next();

        String userCurrencyRequest = "https://v6.exchangerate-api.com/v6/4f4f950220bf969d1cbfd78a/latest/"+userCurrency;

        try {
            //creamos una request a un servidor mediante HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    //se coloca el link de la API request
                    .uri(URI.create(userCurrencyRequest))
                    .build();

            //tenemos que resivir los datos del srevidor
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //respuesta de la API en formato JSON
            String json = response.body();
            //System.out.println("Formato en Json: " + json);

            //instancia de la libreria gson con politica upper camel case
            Gson gson = new Gson();

            //transformar de Json a una clase record con un Object como parametro
            ConversionRateList conversionRate = gson.fromJson(json, ConversionRateList.class);
            System.out.println("Resultado de convertir de Json a Clase Record: " + conversionRate);

            //el object de la clase Record pasa a la clase "ExchangeRateList"
            ExchangeRateList exchangeRateList = new ExchangeRateList(conversionRate, "Lista de Conversiones");
            System.out.println(exchangeRateList.getNameList() + ": " + exchangeRateList.getListEstructure());
        } catch (JsonSyntaxException e) {
            System.out.println(e.getMessage());
        }



        scanner.close();
    }
}

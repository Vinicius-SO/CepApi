package services;

import com.google.gson.Gson;
import models.Address;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CepApiService {
    public static Address findAddress(String cep){

        String httpURI = "https://viacep.com.br/ws/"+ cep +"/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(httpURI))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Address.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir do cep informado");
        }
    }
}

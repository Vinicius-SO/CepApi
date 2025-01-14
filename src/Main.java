import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Address;
import services.CepApiService;

import java.io.IOException;

import java.util.Scanner;

import static services.AddressService.AddressSaver;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create()
        ;

        System.out.println("Digite o cep que deseja pesquisar o endereço:");
        String cep =  scanner.nextLine();

        var address = CepApiService.findAddress(cep);
        System.out.println(address);

        try {
            AddressSaver(gson.toJson(address));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
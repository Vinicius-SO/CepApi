package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Address;

import java.io.FileWriter;
import java.io.IOException;

public class AddressService {
    public static void AddressSaver(Address address) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create()
        ;
        FileWriter writer = new FileWriter(address.cep()+".json");
        writer.write(gson.toJson(address));
        writer.close();
    }
}

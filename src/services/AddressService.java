package services;

import java.io.FileWriter;
import java.io.IOException;

public class AddressService {
    public static void AddressSaver(String address) throws IOException {
        FileWriter writer = new FileWriter("Address.json");
        writer.write(address);
        writer.close();
    }
}

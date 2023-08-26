import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorArq {
    void salvaJson(List<Endereco> enderecos) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("enderecos.Json");

        escrita.write(gson.toJson(enderecos));
        escrita.close();
    }
}

package Mains;

import com.google.gson.Gson;
import horaDaPratica.classes.classeJSON.Pessoa;

public class MainJSON {
    static void main() {
        String jsonPessoa = "{\"nome\":\"Nicole\",\"idade\":20,\"cidade\":\"Londrina\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println(pessoa);
    }
}

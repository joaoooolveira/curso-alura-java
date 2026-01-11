package Mains;

import com.google.gson.Gson;
import horaDaPratica.classes.classeJSON.Editora;
import horaDaPratica.classes.classeJSON.Livro;

public class MainLivroJSON {
    static void main() {
        String json = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(json, Livro.class);
        
        System.out.println(livro);
    }
}

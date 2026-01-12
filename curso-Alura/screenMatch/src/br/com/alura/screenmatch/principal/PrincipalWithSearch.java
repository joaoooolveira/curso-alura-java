package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecoes.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalWithSearch {
    static void main() throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String buscaDeFilme = "";

        List<Titulo> listaDeTitulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        while(!buscaDeFilme.equalsIgnoreCase("sair")) {

            System.out.print("Digite um filme que deseja buscar: ");
            buscaDeFilme = leitura.nextLine();

            if(buscaDeFilme.equalsIgnoreCase("sair")){
                break;
            }

            String chaveAPI = "90aa8218";

            String endereco = "https://www.omdbapi.com/?t=" + buscaDeFilme.replace(" ", "-") + "&apikey=" + chaveAPI;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println("Arquivo json: " + json + "\n");

                TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
                System.out.println("Gson API OMDB: " + meuTituloOMDB + "\n");

                Titulo meuTitulo = new Titulo(meuTituloOMDB);
                System.out.println("Classe titulo: " + meuTitulo + "\n");

                listaDeTitulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException ArgumentoInvalido) {
                System.out.println("Erro de argumento na busca, verifique o endereço");
                System.out.println(ArgumentoInvalido.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMensagem());
            }
        }
        System.out.println(listaDeTitulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(listaDeTitulos));
        escrita.close();
    }
}

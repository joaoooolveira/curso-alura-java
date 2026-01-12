package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalWithLists {
    static void main() {
        Filme oPoderosoChefao = new Filme("O poderoso chefão", 1970);
        oPoderosoChefao.avaliarTitulo(9);

        Filme avatarOCaminhoDaAgua = new Filme("Avatar: O caminho da água", 2022);
        avatarOCaminhoDaAgua.avaliarTitulo(6);

        Filme dogville = new Filme("Dogville", 2003);
        dogville.avaliarTitulo(10);

        Serie lost = new Serie("Lost", 2000);

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(oPoderosoChefao);
        listaDeAssistidos.add(avatarOCaminhoDaAgua);
        listaDeAssistidos.add(dogville);
        listaDeAssistidos.add(lost);
        Collections.sort(listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        for (Titulo titulosAssistidos : listaDeAssistidos){
            System.out.println(titulosAssistidos);
            if(titulosAssistidos instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacaoDoTitulo());
                System.out.println();
            }
        }

        List<String> buscarArtista = new ArrayList<>();
        buscarArtista.add("Adam Sandler");
        buscarArtista.add("The rock");
        buscarArtista.add("Chris Hemsworth");

        //Ordena em ordem alfabética
        Collections.sort(buscarArtista);
        System.out.println(buscarArtista);

    }
}

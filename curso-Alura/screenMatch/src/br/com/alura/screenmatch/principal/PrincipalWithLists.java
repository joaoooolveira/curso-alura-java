package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalWithLists {
    static void main() {
        Filme oPoderosoChefao = new Filme("O poderoso chefão", 1970);
        oPoderosoChefao.avaliarTitulo(9);

        Filme avatarOCaminhoDaAgua = new Filme("Avatar: O caminho da água", 2022);
        avatarOCaminhoDaAgua.avaliarTitulo(6);

        Filme dogville = new Filme("Dogville", 2003);
        dogville.avaliarTitulo(10);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(oPoderosoChefao);
        listaDeAssistidos.add(avatarOCaminhoDaAgua);
        listaDeAssistidos.add(dogville);
        listaDeAssistidos.add(lost);

        for (Titulo titulosAssistidos : listaDeAssistidos){
            System.out.println(titulosAssistidos);
            if(titulosAssistidos instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacaoDoTitulo());
                System.out.println();
            }
        }
    }
}

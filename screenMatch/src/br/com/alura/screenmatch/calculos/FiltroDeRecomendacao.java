package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroDeRecomendacao{
    private String recomendacao;

    public void filtragem(avaliacaoDeTitulos classificavel) {
        if (classificavel.getClassificacaoDoTitulo() >= 4){
            System.out.println("Esse titulo esta entre os preferidos do momento");
        } else if (classificavel.getClassificacaoDoTitulo() >= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}

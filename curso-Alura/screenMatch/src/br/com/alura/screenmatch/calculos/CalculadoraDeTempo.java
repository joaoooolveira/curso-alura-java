package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void incluiTitulo(Filme minhaListaFilme){
//        this.tempoTotal += minhaListaFilme.getDuracaoEmMinutos();
//    }
//
//    public void incluiTitulo(Serie minhaListaSerie){
//        this.tempoTotal += minhaListaSerie.getDuracaoEmMinutos();
//    }

    public void incluiTitulo(Titulo minhaLista){
        this.tempoTotal = minhaLista.getDuracaoEmMinutos();
    }
}

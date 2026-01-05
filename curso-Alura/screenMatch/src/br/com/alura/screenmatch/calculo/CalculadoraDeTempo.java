package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiTempo(Titulo minhaLista){
        this.tempoTotal += minhaLista.getDuracaoEmMinutos();
    }
}

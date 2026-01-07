package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.avaliacaoDeTitulos;

public class Filme extends Titulo implements avaliacaoDeTitulos {
    private String diretorDoFilme;

    public String getDiretorDoFilme() {
        return diretorDoFilme;
    }

    public void setDiretorDoFilme(String diretorDoFilme) {
        this.diretorDoFilme = diretorDoFilme;
    }

    @Override
    public int getClassificacaoDoTitulo() {
        return (int) returnMedias() / 2;
    }
}

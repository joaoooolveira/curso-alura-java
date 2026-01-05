package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadasDaSerie;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean serieAtiva;

    public int getTemporadasDaSerie() {
        return temporadasDaSerie;
    }

    public void setTemporadasDaSerie(int temporadasDaSerie) {
        this.temporadasDaSerie = temporadasDaSerie;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isSerieAtiva() {
        return serieAtiva;
    }

    public void setSerieAtiva(boolean serieAtiva) {
        this.serieAtiva = serieAtiva;
    }
}

package br.com.alura.reprodutorMusical.metodos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int Totalcurtidas;
    private double classificacao;

    public void Curtir() {
        this.Totalcurtidas++;
    }

    public void Reproduzir(){
        this.totalDeReproducoes++;
    }

    public double classificacaoAudio(){
        if(Totalcurtidas >= 5){
            return this.classificacao = 5;
        } else if(Totalcurtidas >= 3){
            return this.classificacao = 3;
        } else {
            return this.classificacao = 1;
        }
    }

    public void audioAvaliado(Audio audio){
        audio.classificacaoAudio();
        String avaliacoes = """
                Reproduções: %d
                Curtidas: %d
                Classificação: %.1f""".formatted(audio.getTotalDeReproducoes(), audio.getCurtidas(), audio.getClassificacao());

        System.out.println(avaliacoes);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return Totalcurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }
}

package horaDaPratica.classes.funcoes;

public class Musica {
    private String tituloMusica;
    private String nomeArtista;
    private int anoLancamento;
    private double avaliacao;
    private int totalDeAvaliacoes;

    public void setTituloMusica(String tituloMusica) {
        this.tituloMusica = tituloMusica;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void fichaTecnica(){
        String mensagemDeFichaTecnica = """
                Título: %s
                Artista: %s
                Ano de lançamento: %d
                Avaliação: %.1f (%d)""".formatted(tituloMusica, nomeArtista, anoLancamento, retornarMedias(), totalDeAvaliacoes);

        System.out.println(mensagemDeFichaTecnica);
    }

    public void avaliarMusica(double nota){
        avaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double retornarMedias(){
        return avaliacao / totalDeAvaliacoes;
    }
}

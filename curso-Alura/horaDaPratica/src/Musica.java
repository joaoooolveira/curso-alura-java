public class Musica {
    String tituloMusica;
    String nomeArtista;
    int anoLancamento;
    double avaliacao;
    int totalDeAvaliacoes;

    void fichaTecnica(){
        String mensagemDeFichaTecnica = """
                Título: %s
                Artista: %s
                Ano de lançamento: %d
                Avaliação: %.1f (%d)""".formatted(tituloMusica, nomeArtista, anoLancamento, retornarMedias(), totalDeAvaliacoes);

        System.out.println(mensagemDeFichaTecnica);
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        totalDeAvaliacoes++;
    }

    double retornarMedias(){
        return avaliacao / totalDeAvaliacoes;
    }
}

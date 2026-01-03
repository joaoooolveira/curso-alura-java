public class Filme {
    String nomeFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacaoDoFilme;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avaliarFilme(double notaDoFilme){
        avaliacaoDoFilme += notaDoFilme;
        totalDeAvaliacoes++;
    }

    double returnMedias(){
        return avaliacaoDoFilme / totalDeAvaliacoes;
    }
}

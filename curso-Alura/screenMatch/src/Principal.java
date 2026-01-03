public class Principal {
    static void main() {
        Filme meuFilme = new Filme();
        meuFilme.nomeFilme = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(7);
        meuFilme.avaliarFilme(10);

        System.out.println(meuFilme.avaliacaoDoFilme);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.returnMedias());
    }
}

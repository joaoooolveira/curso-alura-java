public class Carro {
    String modeloDoCarro;
    int anoDoCarro;
    String cor;
    int idadeDoCarro;

    void fichaDoCarro(){
        String mensagemDeFichaDoCarro = """
                Modelo: %s
                Ano: %d
                Cor do carro: %s""".formatted(modeloDoCarro, anoDoCarro, cor);

        System.out.println(mensagemDeFichaDoCarro);
    }

    void calcularIdadeDoCarro(int anoAtual){
        idadeDoCarro = anoAtual - anoDoCarro;
    }

    int apresentarIdadeDoCarro(){
        return idadeDoCarro;
    }
}

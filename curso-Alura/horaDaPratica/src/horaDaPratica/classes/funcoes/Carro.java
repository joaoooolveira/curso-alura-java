package horaDaPratica.classes.funcoes;

public class Carro {
    private String modeloDoCarro;
    private int anoDoCarro;
    private String cor;
    private int idadeDoCarro;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public void fichaDoCarro(){
        String mensagemDeFichaDoCarro = """
                Modelo: %s
                Ano: %d
                Cor do carro: %s""".formatted(modeloDoCarro, anoDoCarro, cor);

        System.out.println(mensagemDeFichaDoCarro);
    }

    public void calcularIdadeDoCarro(int anoAtual){
        idadeDoCarro = anoAtual - anoDoCarro;
    }

    public int apresentarIdadeDoCarro(){
        return idadeDoCarro;
    }
}

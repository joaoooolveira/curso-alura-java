package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.ContaBancaria;

public abstract class OperacaoBancaria implements AcaoBancaria{
    private double valor;

    public OperacaoBancaria(double valor){
        validarDados(valor);

        this.valor = valor;
    }

    private void validarDados(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Digite um valor válido");
        }
    }

    public double getValor() {
        return valor;
    }
}

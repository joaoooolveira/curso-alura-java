package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.ContaBancaria;

public class Deposito extends OperacaoBancaria{
    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Depósito de R$%.2f realizado".formatted(getValor()));
    }
}

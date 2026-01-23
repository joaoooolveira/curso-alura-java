package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.ContaBancaria;

public class Saque extends OperacaoBancaria{
    public Saque(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Saque de R$%.2f realizado".formatted(getValor()));
    }
}

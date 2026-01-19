package br.com.alura.PraticandoJAVA.POO.metodos;

public class Conta {
    private double saldo;

    public Conta(double saldo){
        if(saldo < 0){
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }

        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.printf("%.2f\n", saldo);
    }

    public void zerarSaldo(){
        saldo = 0.0;
    }
}

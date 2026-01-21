package br.com.alura.PraticandoJAVA.Encapsulamento.metodos;

public class Conta {
    private String titular;
    private double saldo;

    public Conta (String titular){
        if(titular == null || titular.isBlank()){
            throw new IllegalArgumentException("Digite o nome do titular");
        }
        this.titular = titular;
    }

    public void depositar(double deposito){
        if(deposito <= 0){
            throw new IllegalArgumentException("Não foi possivel fazer esse deposito.");
        }
        saldo += deposito;
    }

    public void sacar(double saque){
        if(saque <= saldo){
            saldo -= saque;
            System.out.println("Saque realizado com sucesso!");
        }
        if(saque <= 0){
            throw new IllegalArgumentException("Não foi possível realizar esse saque.");
        }
        else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo da conta: " + saldo + "\n");
    }
}

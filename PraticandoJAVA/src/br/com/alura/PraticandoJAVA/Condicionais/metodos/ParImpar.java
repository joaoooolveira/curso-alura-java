package br.com.alura.PraticandoJAVA.Condicionais.metodos;

public class ParImpar {
    private int numero;

    public ParImpar(int numero){
        this.numero = numero;
    }

    public String verificarParOuIrmpar(){
        if(numero % 2 == 0){
            return "Par";
        } else {
            return "Impar";
        }
    }

    @Override
    public String toString() {
        return "O número que você digitou é: " + verificarParOuIrmpar();
    }
}

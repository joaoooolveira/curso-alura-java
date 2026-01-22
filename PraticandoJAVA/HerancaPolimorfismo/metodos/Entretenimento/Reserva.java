package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Entretenimento;

public class Reserva {
    public void reservar(){
        System.out.println("Reserva realizada.");
    }

    public void reservar(String data){
        System.out.println("Reserva feita para o dia " + data);
    }

    public void reservar(String data, int quantidadeDePessoas){
        System.out.println("Reserva feita para o dia %s para %d pessoas".formatted(data, quantidadeDePessoas));
    }
}

package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Entretenimento;

public class ReservaVip extends Reserva{
    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo.");
    }
}

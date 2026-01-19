package br.com.alura.PraticandoJAVA.POO.metodos;

public class Estufa {
    private String local;
    private double temperatura;

    public Estufa(String local, double temperatura){
        if(local == null || local.isBlank()){
            throw new IllegalArgumentException("Digite o setor.");
        }

        this.local = local;
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return """
                Local: %s
                Temperatura: %.1f Cº""".formatted(local, temperatura);
    }

    public void verificarTemperatura(){
        if(temperatura > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        } else if(temperatura < 10.0) {
            System.out.println("Alerta: Temperatura abaixo do limite!");
        } else {
            System.out.println("Temperatura padrão.");
        }
    }
}

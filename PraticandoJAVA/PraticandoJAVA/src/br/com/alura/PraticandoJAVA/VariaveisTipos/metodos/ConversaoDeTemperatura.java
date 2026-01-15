package br.com.alura.PraticandoJAVA.VariaveisTipos.metodos;

public class ConversaoDeTemperatura {
    private double grausCelsius;

    public ConversaoDeTemperatura(double grausCelsius){
        this.grausCelsius = grausCelsius;
    }

    public double getGrausFahrenheit(){
        return (grausCelsius * 9 / 5) + 32;
    }

    @Override
    public String toString() {
        return """
                Temperatura em Fahrenheit: %.1f""".formatted(getGrausFahrenheit());
    }
}

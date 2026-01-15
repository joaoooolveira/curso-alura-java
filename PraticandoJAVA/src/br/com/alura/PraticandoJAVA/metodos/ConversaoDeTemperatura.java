package br.com.alura.PraticandoJAVA.metodos;

public class ConversaoDeTemperatura {
    private double grausFahrenheit;

    public double ConverterTemperaturaParaFahrenheit(double grausCelsius){
        return grausFahrenheit = (grausCelsius * 9 / 5) + 32;
    }

    @Override
    public String toString() {
        return """
                Temperatura em Fahrenheit: %.1f""".formatted(grausFahrenheit);
    }
}

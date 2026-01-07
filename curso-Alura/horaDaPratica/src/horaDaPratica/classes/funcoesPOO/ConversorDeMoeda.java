package horaDaPratica.classes.funcoesPOO;

public class ConversorDeMoeda implements ConversaoFinanceira{
    private double ValorEmDolar;

    @Override
    public double converterDolarParaReal(){
        return ValorEmDolar * 5.38;
    }

    public void setValorEmDolar(double valorEmDolar) {
        ValorEmDolar = valorEmDolar;
    }
}

package horaDaPratica.classes.funcoesPOO;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void setBase(double base) {
        this.base = base;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
}

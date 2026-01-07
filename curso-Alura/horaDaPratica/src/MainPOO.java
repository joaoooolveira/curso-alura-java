import horaDaPratica.classes.funcoesPOO.CalculadoraSalaRetangular;
import horaDaPratica.classes.funcoesPOO.ConversorDeMoeda;

import java.util.Scanner;

public class MainPOO {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ConversorDeMoeda converterDolar = new ConversorDeMoeda();

        System.out.println("Digite o valor em dolar que deseja converter: ");
        double valorEmDolar = sc.nextDouble();
        converterDolar.setValorEmDolar(valorEmDolar);

        System.out.println(String.format("%.2fU$ é igual a: %.2fR$", valorEmDolar, converterDolar.converterDolarParaReal()));

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        System.out.println("Digite o valor da base: ");
        double valorBase = sc.nextDouble();
        calculadora.setBase(valorBase);

        System.out.println("Digite o valor da altura: ");
        double valorAltura = sc.nextDouble();
        calculadora.setAltura(valorAltura);

        System.out.println("Área do retângulo: " + calculadora.calcularArea());
        System.out.println("Perímetro do retângulo: " + calculadora.calcularPerimetro());


    }
}

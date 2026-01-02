import java.util.Scanner;

public class ConversaoDeTemperaturasExemplo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus Celsius: ");
        double temperaturaEmCelsius = sc.nextDouble();

        double temperaturaEmFarenheit = (temperaturaEmCelsius * 1.8) + 32;
        System.out.println(String.format("Temperatura em Farenheit: %.1fº", temperaturaEmFarenheit));

    }
}

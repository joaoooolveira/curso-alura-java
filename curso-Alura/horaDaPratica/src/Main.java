import horaDaPratica.classes.funcoes.Calculadora;
import horaDaPratica.classes.funcoes.Carro;
import horaDaPratica.classes.funcoes.Musica;
import horaDaPratica.classes.funcoes.Pessoa;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //Pedir o nome da pessoa e saudar a mesma.
        System.out.println("Digite seu nome:");
        String seuNome = sc.nextLine();

        Pessoa saudacao = new Pessoa();

        saudacao.setNomePessoa(seuNome);
        saudacao.saudarPessoa();

        //Criar uma calculadora que dobre o número escrito.
        Calculadora dobrarNumero = new Calculadora();

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        dobrarNumero.setNumero(n);

        System.out.println(dobrarNumero.dobroDoNumero());

        //Apresentar uma música, avaliar e apresentar a ficha técnica dessa música.
        Musica verMusica = new Musica();

        verMusica.setTituloMusica("That's My Way (part. Seu Jorge)");
        verMusica.setNomeArtista("Edi Rock");
        verMusica.setAnoLancamento(2013);

        verMusica.avaliarMusica(9);
        verMusica.avaliarMusica(7);
        verMusica.avaliarMusica(10);

        verMusica.fichaTecnica();

        //Apresentar um carro, a sua ficha técnica e qual a idade do carro
        Carro apresentarCarro = new Carro();
        apresentarCarro.setModeloDoCarro("Corolla");
        apresentarCarro.setAnoDoCarro(2017);
        apresentarCarro.setCor("Preto");

        apresentarCarro.fichaDoCarro();
        apresentarCarro.calcularIdadeDoCarro(2026);

        System.out.printf("Idade do carro: %d", apresentarCarro.apresentarIdadeDoCarro());
    }
}

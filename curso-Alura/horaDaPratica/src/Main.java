import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //Pedir o nome da pessoa e saudar a mesma.
        Pessoa saudacao = new Pessoa();

        System.out.println("Digite seu nome:");
        saudacao.nomePessoa = sc.nextLine();
        saudacao.saudarPessoa();

        //Criar uma calculadora que dobre o número escrito.
        Calculadora dobrarNumero = new Calculadora();

        System.out.println("Digite um número: ");
        dobrarNumero.numero = sc.nextInt();
        System.out.println(dobrarNumero.dobroDoNumero());

        //Apresentar uma música, avaliar e apresentar a ficha técnica dessa música.
        Musica verMusica = new Musica();

        verMusica.tituloMusica = "That's My Way (part. Seu Jorge)";
        verMusica.nomeArtista = "Edi Rock";
        verMusica.anoLancamento = 2013;

        verMusica.avaliarMusica(9);
        verMusica.avaliarMusica(7);
        verMusica.avaliarMusica(10);

        verMusica.fichaTecnica();

        //Apresentar um carro, a sua ficha técnica e qual a idade do carro
        Carro apresentarCarro = new Carro();
        apresentarCarro.modeloDoCarro = "Corolla";
        apresentarCarro.anoDoCarro = 2017;
        apresentarCarro.cor = "Preto";

        apresentarCarro.fichaDoCarro();
        apresentarCarro.calcularIdadeDoCarro(2026);

        System.out.printf("Idade do carro: %d", apresentarCarro.apresentarIdadeDoCarro());
    }
}

import br.com.alura.modelos.Cartao;
import br.com.alura.modelos.Produtos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite do seu cartão: ");
        double limiteCartao = sc.nextDouble();
        Cartao cartao = new Cartao(limiteCartao);

        List<Produtos> listaDeProdutos = new ArrayList<>();

        int i = 1;
        while(i != 0){
            System.out.print("Digite o nome do produto que deseja comprar: ");
            String nomeProduto = sc.next();

            System.out.print("Digite o preço desse produto: ");
            double valorProduto = sc.nextDouble();

            if(cartao.Comprar(valorProduto)){
                Produtos produtos = new Produtos(nomeProduto, valorProduto);
                listaDeProdutos.add(produtos);
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Limite insuficiente.");
                break;
            }
            System.out.println();
            System.out.println("Deseja continuar comprando? se sim digite 1, se não digite 0");
            i = sc.nextInt();

            System.out.println("\nLimite atual do cartão: " + cartao.getLimiteCartao());
            System.out.println();
        }

        listaDeProdutos.sort(Comparator.comparing(Produtos::getValorProduto));

        for (Produtos listaDeProduto : listaDeProdutos) {
            System.out.println(listaDeProduto);
        }
    }
}

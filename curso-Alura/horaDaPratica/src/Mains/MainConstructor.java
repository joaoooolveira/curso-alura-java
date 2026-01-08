package Mains;

import horaDaPratica.classes.Arraylist.ProdutoConstructor;
import horaDaPratica.classes.Arraylist.ProdutoPerecivel;

import java.util.ArrayList;

public class MainConstructor {
    static void main() {
        ProdutoConstructor maca = new ProdutoConstructor("Maçã", 1.50, 10);
        ProdutoConstructor banana = new ProdutoConstructor("Banana", 2.00, 15);
        ProdutoConstructor repolho = new ProdutoConstructor("Repolho", 4.00, 5);
        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 4.00, 12, "12/26");

        ArrayList<ProdutoConstructor> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(maca);
        listaDeProdutos.add(banana);
        listaDeProdutos.add(repolho);
        listaDeProdutos.add(leite);

        System.out.println("Produtos (" + listaDeProdutos.size() + ")");

        System.out.println(listaDeProdutos);
    }
}

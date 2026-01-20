package br.com.alura.PraticandoJAVA.Encapsulamento.exercicios;

import br.com.alura.PraticandoJAVA.Encapsulamento.metodos.Carro;
import br.com.alura.PraticandoJAVA.Encapsulamento.metodos.Contato;
import br.com.alura.PraticandoJAVA.Encapsulamento.metodos.ListaDeContatos;

public class Encapsulamento {
    public static void main(String[] args){
        //Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos que chegam para manutenção.
        // Cada carro precisa ser identificado com algumas informações para o controle interno.
        //
        //Crie um programa que:
        //
        //Defina uma classe com os atributos modelo, placa e ano.
        //Defina uma instancia dessa classe através do método construtor.
        //Exiba as informações do veículo no console.
        Carro gol = new Carro("Gol", "ABC-1234", 2020);
        System.out.println(gol);

        //Você está desenvolvendo um aplicativo de agenda para uma empresa. Os funcionários precisam acessar rapidamente
        // os contatos de clientes e fornecedores, mantendo as informações organizadas e fáceis de localizar.
        //
        //Crie uma classe que:
        //
        //Armazene contatos com nome e telefone em uma lista
        //Permita visualizar todos os contatos cadastrados
        //Formate a exibição para melhor legibilidade
        ListaDeContatos contatos = new ListaDeContatos();

        contatos.adicionarContato(new Contato("João Pedro", "(12) 12345-6789"));
        contatos.adicionarContato(new Contato("Daniel", "(12) 12344-6789"));
        contatos.adicionarContato(new Contato("Gabriel", "(11) 12345-6789"));

        contatos.listarContatos();
    }
}

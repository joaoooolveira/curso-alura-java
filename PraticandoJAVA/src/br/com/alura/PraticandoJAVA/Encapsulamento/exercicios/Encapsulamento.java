package br.com.alura.PraticandoJAVA.Encapsulamento.exercicios;

import br.com.alura.PraticandoJAVA.Encapsulamento.metodos.Carro;

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
    }
}

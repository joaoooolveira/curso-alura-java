package br.com.alura.PraticandoJAVA.Loops.exercicios;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        //Carla começou a praticar trilha e deseja saber quantos degraus
        // precisará subir para chegar ao topo de uma escadaria.
        // Ela sobe um degrau por vez e quer um programa que mostre sua subida até o topo.
        // Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.
        System.out.print("Digite a quantidade de degraus que deseja subir: ");
        int degraus = leitura.nextInt();

        if (degraus > 0){
            for (int i = 1; i <= degraus; i++) {
                System.out.println("Subindo o degrau: " + i);
            }
        } else {
            System.out.println("Digite um número válido.");

        }
    }
}

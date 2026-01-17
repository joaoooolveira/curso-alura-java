package br.com.alura.PraticandoJAVA.DateTime.exercicios;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args){

        //Você está desenvolvendo um sistema de log para um aplicativo de gerenciamento de tarefas.
        // Sempre que uma nova tarefa é criada, o sistema deve registrar a data e a hora exatas do momento da criação.
        //
        //Para isso, implemente um programa que:
        //
        //Simule a criação de uma tarefa através de uma variável simples, por exemplo String tarefa = "Enviar relatório semanal";.
        //Registre a data e a hora exatas da criação.
        //Exiba essas informações no formato adequado.
        LocalDateTime dataHoraLancamentoDeRelatorio = LocalDateTime.now();

        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataHoraLancamentoDeRelatorio.format(formatarData);

        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = dataHoraLancamentoDeRelatorio.format(formatarHora);

        System.out.println("Relatório Semanal enviado!");
        System.out.println("Data: " + dataFormatada + "\nHora: " + horaFormatada + "\n");

        //Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento.
        // Você precisa monitorar o tempo gasto em cada tarefa para garantir que os projetos sejam executados dentro do prazo.
        //
        //Para isso, crie um programa que:
        //
        //Receba dois horários representando o início e o término de uma atividade.
        //Calcule a diferença em horas e minutos entre esses dois horários.
        //Exiba o resultado formatado.
        LocalTime horarioDeInicioDeTarefa = LocalTime.of(8,00);
        LocalTime horarioDeFinalizacaoDeTarefa = LocalTime.now();

        Duration tempoAteFinalizar = Duration.between(horarioDeInicioDeTarefa, horarioDeFinalizacaoDeTarefa);
        long hora = tempoAteFinalizar.toHours();
        long minutos = tempoAteFinalizar.toMinutes() % 60;
        System.out.printf("Tempo até finalizar atividade: %02d:%02d%n%n", hora, minutos);
    }
}

package br.com.alura.PraticandoJAVA.DateTime.exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

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

        System.out.println("Relatorio Semanal enviado!");
        System.out.println("Data: " + dataFormatada + "\nHora: " + horaFormatada);

    }
}

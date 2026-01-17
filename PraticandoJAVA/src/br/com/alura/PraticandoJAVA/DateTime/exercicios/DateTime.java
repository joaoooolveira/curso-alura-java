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

        //Você é responsável pelos projetos em uma empresa de desenvolvimento de software.
        // Para garantir que os prazos sejam cumpridos, você precisa calcular a data de entrega de cada
        // projeto com base na data de início e no prazo estimado em dias.
        //
        //Você precisa criar um programa que:
        //
        //Receba uma data de início.
        //Adicione o prazo em dias ao início do projeto.
        //Exiba a data final formatada corretamente.
        int diasParaEntregar = 15;

        LocalDate dataDeInicioDoProjeto = LocalDate.of(2026, 1, 15);
        LocalDate dataDeEntregaDoProjeto = dataDeInicioDoProjeto.plusDays(diasParaEntregar);

        DateTimeFormatter formatarDataDeEntrega = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeEntregaFormatada = dataDeEntregaDoProjeto.format(formatarDataDeEntrega);

        System.out.println("Data de entrega do projeto: " + dataDeEntregaFormatada + "\n");

        //Você trabalha no setor financeiro de uma empresa de serviços e é responsável por gerenciar
        // o vencimento das faturas dos clientes. Em alguns casos, os clientes solicitam um adiamento da data de pagamento,
        // e o sistema precisa calcular a nova data de vencimento com base na quantidade de meses adicionados.
        //
        //Crie um programa que:
        //
        //Receba uma data de vencimento original.
        //Adicione um número de meses ao vencimento.
        //A data ajustada deve ser exibida no formato dd-MM-yyyy.
        int mesesDeAdiantamento = 1;
        LocalDate dataDeVencimentoOriginal = LocalDate.of(2026, 3, 20);
        LocalDate novaDataDeVencimento = dataDeVencimentoOriginal.plusMonths(mesesDeAdiantamento);

        DateTimeFormatter formatarDataDeVencimento = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String novaDataDeVencimentoFormatada = novaDataDeVencimento.format(formatarDataDeVencimento);

        System.out.println("Nova data de vencimento: " + novaDataDeVencimentoFormatada);
    }
}

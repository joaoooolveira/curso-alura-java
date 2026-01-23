package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.exercicios;

import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Aluno.Aluno;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Aluno.Bolsista;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Biblioteca.Ebook;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Biblioteca.Livro;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Biblioteca.Midia;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Biblioteca.Revista;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Colaboracao.Mensagem;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.ContaBancaria.Deposito;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.ContaBancaria.OperacaoBancaria;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.ContaBancaria.Saque;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Entretenimento.Reserva;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Entretenimento.ReservaVip;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Mensagem.Email;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Mensagem.Notificacao;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Mensagem.Push;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Mensagem.SMS;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pagamento.BoletoBancario;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pagamento.CartaoCredito;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pagamento.Pagamento;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pagamento.Pix;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pessoas.AlunoPessoa;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pessoas.DocentePessoa;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Relatorio.Imprimivel;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Relatorio.Relatorio;

import java.util.ArrayList;
import java.util.List;

public class Heranca {
    public static void main(String[] args){
        //Você está construindo um sistema acadêmico para uma escola. Cada aluno possui um nome e pode ser identificado no sistema com uma mensagem padrão.
        // A escola também possui alunos bolsistas. Para deixar o sistema mais informativo,
        // queremos exibir o tipo do aluno no momento da identificação, como "bolsista" ou "regular".
        //
        //Crie um programa que:
        //
        //Defina uma classe Aluno com nome e tipo.
        //Crie um método identificar() que que imprime: "Aluno: [nome] - Tipo: [tipo]".
        //Crie uma classe Bolsista que herda de Aluno e define o tipo automaticamente como "bolsista".
        // Crie um objeto Aluno regular e um Bolsista, e chame o método identificar() de cada um.
        Aluno aluno1 = new Aluno("Fernanda", "Regular");
        Bolsista aluno2 = new Bolsista("João");

        aluno1.identificarAluno();
        aluno2.identificarAluno();
        System.out.println();

        //Você está desenvolvendo um sistema de gestão para uma escola, onde é necessário organizar informações de alunos e docentes.
        // Cada pessoa na escola possui dados básicos, como nome e idade. No entanto, cada grupo também possui características próprias:
        // os alunos possuem uma nota final e os docentes são responsáveis por uma disciplina.
        //
        //Crie um programa que:
        //
        //Defina uma classe Pessoa com os atributos nome e idade.
        //Crie as classes Aluno e Docente, ambas herdando de Pessoa, adicionando:
        //Para Aluno: um atributo nota.
        //Para Docente: um atributo disciplina.
        //Instancie dois objetos Aluno e dois objetos Docente
        //Exiba as informações no terminal.
        AlunoPessoa alunoPessoa1 = new AlunoPessoa("Julia", 16, 8.5);
        AlunoPessoa alunoPessoa2 = new AlunoPessoa("Caio", 17, 7.2);
        DocentePessoa docentePessoa1 = new DocentePessoa("Marta", 40, "Matemática");
        DocentePessoa docentePessoa2 = new DocentePessoa("Roberto", 38, "História");

        System.out.println(alunoPessoa1);
        System.out.println(alunoPessoa2);
        System.out.println(docentePessoa1);
        System.out.println(docentePessoa2);
        System.out.println();

        //Imagine que você está desenvolvendo um sistema para uma biblioteca que precisa catalogar diferentes tipos de mídias:
        // livros, revistas e e-books. Cada mídia possui informações específicas, como título e ano de publicação,
        // mas algumas têm características únicas, como autor (livros), edição (revistas) ou formato (e-books).
        // Seu programa deve ser capaz de exibir esses dados para facilitar a consulta pelos bibliotecários.
        //
        //Crie um programa que:
        //
        //Defina uma classe Midia com os atributos título e ano de publicação.
        //Defina um método que gere um código no formato “LIB- + os três primeiros caracteres do título + ano de publicação”, por exemplo:
        //Código: LIB-O H1937 | Livro: "O Hobbit" - Autor: J.R.R. Tolkien
        //Crie as classes Livro, Revista e Ebook, todas herdando de Midia, adicionando:
        //Livro: atributo autor.
        //Revista: atributo edição.
        //Ebook: atributo formato.
        //Cadastre uma mídia de cada tipo.
        //Exiba o código e os detalhes de cada mídia usando o método exibirInfo.
        Midia hobbit = new Livro("O Hobbit", 1937, "J.R.R Tolkien");
        Midia natGeographic = new Revista("National Geographic", 2023, 245);
        Midia cleanCode = new Ebook("Clean Code", 2008, "PDF");

        List<Midia> midias = new ArrayList<>();
        midias.add(hobbit);
        midias.add(natGeographic);
        midias.add(cleanCode);

        for (Midia m : midias){
            m.exibirInfo();
        }
        System.out.println();

        //Você está desenvolvendo um sistema de comunicação para uma plataforma que precisa enviar alertas aos usuários de diferentes formas.
        // Cada tipo de notificação tem suas particularidades: um e-mail exige um assunto e um corpo, um SMS somente o texto da mensagem,
        // e uma notificação push deve conter um título e uma mensagem de texto.
        //
        //Crie um programa que:
        //
        //Defina uma classe base Notificacao com atributos destinatário e mensagem.
        //Crie classes específicas (Email, SMS, Push) que herdem de Notificacao.
        //Cada uma deve implementar o seu próprio método enviar(), exibindo como cada notificação é disparada.
        // Lembre-se de sobrescrever o método utilizando a anotação @override.
        Notificacao notificacao1 = new Email("cliente", "Promoção Especial!", "Aproveite nossos descontos essa semana.");
        Notificacao notificacao2 = new SMS("(11) 12345-6789", "Sua fatura foi paga com sucesso.");
        Notificacao notificacao3 = new Push("usuario", "Novidade!", "Você tem uma nova mensagem.");

        List<Notificacao> listaDeNotificacoes = new ArrayList<>();

        listaDeNotificacoes.add(notificacao1);
        listaDeNotificacoes.add(notificacao2);
        listaDeNotificacoes.add(notificacao3);

        for (Notificacao notificacao : listaDeNotificacoes){
            notificacao.enviar();
            System.out.println();
        }

        //Você está desenvolvendo o núcleo de processamento para uma fintech.
        // A startup precisa de um sistema que possa acomodar diferentes métodos de pagamento,
        // cada um com suas particularidades de confirmação e regras de taxação. Seu desafio é criar uma estrutura que unifique o essencial,
        // mas permita comportamentos específicos para cada forma de pagamento.
        //
        //Crie um programa que:
        //
        //Defina uma classe base Pagamento com o atributo valor.
        //Cada subclasse (CartaoCredito, BoletoBancario e Pix) implementa sua própria lógica de confirmação e cálculo de taxas.
        //Cartão: 3%.
        //Boleto: 1%
        //Pix: sem taxas
        //Exiba a mensagem de confirmação no console e mostre o valor da taxa.
        Pagamento cartao = new CartaoCredito(250);
        Pagamento boleto = new BoletoBancario(500);
        Pagamento pix = new Pix(300);

        List<Pagamento> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(cartao);
        listaPagamentos.add(boleto);
        listaPagamentos.add(pix);

        for(Pagamento pagamentos : listaPagamentos){
            pagamentos.confirmarPagamento();
        }
        System.out.println();

        //Você está desenvolvendo um sistema de comunicação para uma plataforma de colaboração em equipe.
        // Esse sistema precisa lidar com diferentes cenários de envio de mensagens.
        //
        //Crie um programa que utilize sobrecarga de métodos para implementar as seguintes variações:
        //
        //Enviar uma mensagem padrão para todos os contatos, como Olá!.
        //Enviar uma mensagem personalizada para um contato específico, como Bom dia para João.
        //Reforçar uma mensagem enviando-a mais de uma vez para o mesmo contato, como: "Atenção!" para Maria, enviada duas vezes.
        Mensagem notificacao = new Mensagem();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção", 2);
        System.out.println();

        //Imagine que você está desenvolvendo um sistema de gerenciamento para um sistema de entretenimento que oferece diversos serviços,
        // desde restaurantes até áreas de lazer. O sistema precisa lidar com diferentes tipos de reservas,
        // atendendo desde clientes casuais até os que possuem benefícios exclusivos.
        //
        //Crie um programa que:
        //
        //Tenha uma classe Reserva com três versões sobrecarregadas do método reservar():
        //Uma sem parâmetros, que imprime: "Reserva realizada"
        //Uma com data como parâmetro, que imprime: "Reserva feita para o dia [data]"
        //Uma com data e quantidade de pessoas, que imprime: "Reserva feita para o dia [data] para [X] pessoas"
        //Tenha uma subclasse ReservaVip, que herda de Reserva e sobrescreve o método reservar() sem parâmetros,
        // imprimindo uma mensagem exclusiva: "Reserva VIP confirmada com atendimento exclusivo"
        Reserva reserva = new Reserva();
        ReservaVip vip = new ReservaVip();

        reserva.reservar();
        reserva.reservar("10/04");
        reserva.reservar("12/04", 4);
        vip.reservar();
        System.out.println();

        //Você está desenvolvendo um módulo de geração de documentos para um sistema corporativo.
        // Esse módulo precisa oferecer uma forma de exibir diferentes tipos de relatórios, garantindo que todos sigam o mesmo padrão,
        // independentemente de seu conteúdo específico.
        //
        //Crie um programa que:
        //
        //Defina uma interface Imprimivel com o método imprimir()
        //Implemente uma classe Relatorio que siga este contrato
        //Permita que o relatório seja criado com título e conteúdo
        //Exiba as informações no console
        Imprimivel doc = new Relatorio(
                "Relatório 2025",
                "Tudo funcionando conforme esperado."
        );
        doc.imprimir();
        System.out.println();

        //Imagine que você está desenvolvendo um sistema para um banco digital, onde todas as operações financeiras precisam
        // ser tratadas de forma uniforme, mas cada uma com seu comportamento específico. O banco deseja que,
        // independentemente do tipo de operação (depósito, saque, etc.), todas sigam a mesma estrutura básica para facilitar a manutenção e expansão do sistema.
        //
        //Crie um programa que:
        //
        //Tenha uma interface AcaoBancaria com o método executar(), que representa o contrato que toda operação bancária deve seguir.
        //Tenha uma classe abstrata OperacaoBancaria, que implementa essa interface e contém:
        //O atributo valor
        //Um construtor para inicializar esse valor
        //Tenha duas subclasses** que estendem OperacaoBancaria:
        //Deposito: deve imprimir "Depósito de R$[valor] realizado"
        //Saque: deve imprimir "Saque de R$[valor] realizado"
        OperacaoBancaria deposito = new Deposito(200);
        OperacaoBancaria saque = new Saque(50.5);

        deposito.executar();
        saque.executar();
    }
}

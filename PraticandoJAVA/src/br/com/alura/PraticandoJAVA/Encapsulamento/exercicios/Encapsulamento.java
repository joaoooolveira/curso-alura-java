package br.com.alura.PraticandoJAVA.Encapsulamento.exercicios;

import br.com.alura.PraticandoJAVA.Encapsulamento.metodos.*;

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
        System.out.println();

        //Imagine que você é responsável pelo módulo de cadastro de um sistema de gestão de estoque.
        // Durante o processo de entrada de mercadorias, é crítico evitar que produtos sejam registrados com valores inconsistentes,
        // pois isso poderia causar problemas financeiros e operacionais.
        //
        //Seu desafio é implementar uma proteção que impeça a atribuição de preços negativos aos produtos,
        // garantindo que o sistema mantenha dados confiáveis.
        //
        //Crie um programa que:
        //
        //Defina uma classe para representar um produto com nome e preço.
        //Valide se o preço é um valor não negativo antes de atualizá-lo.
        //Se o valor for negativo, então deverá ser redefinido para 0.00.
        //Exiba uma mensagem quando a validação falhar.
        //Por fim, exiba uma mensagem com os dados do produto.
        Produto mouse = new Produto("Mouse Gamer", -55);

        System.out.println(mouse);

        //Você está desenvolvendo um sistema de autenticação para um aplicativo bancário.
        // Os usuários precisam ter total segurança de que suas senhas não podem ser alteradas sem autorização,
        // mesmo que alguém tenha acesso temporário ao dispositivo.
        //
        //Crie uma classe que:
        //
        //Armazene com segurança a senha do usuário
        //Permita alterar a senha apenas com a confirmação da senha atual
        //Forneça feedback sobre o resultado da operação
        Senha senha = new Senha("ABC1234");

        senha.alterarSenha("ABC1234", "abcd123");

        //Você está desenvolvendo um sistema para um banco digital.
        // Os clientes precisam confiar que suas transações serão seguras e que o sistema nunca permitirá que eles gastem mais do que possuem em conta.
        // Seu desafio é garantir essa segurança nas operações financeiras de depositar e sacar.
        //
        //Crie uma classe que:
        //
        //Permita criar contas com titular e saldo inicial.
        //Realize depósitos com valores positivos.
        //Autorize saques apenas quando houver saldo suficiente.
        //Exiba o saldo atualizado após cada operação.
        Conta ana = new Conta("Ana");

        ana.depositar(500);
        ana.exibirSaldo();

        ana.sacar(800);
        ana.exibirSaldo();
    }
}

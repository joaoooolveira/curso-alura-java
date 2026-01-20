package br.com.alura.PraticandoJAVA.Encapsulamento.metodos;

public class Contato {
    private String nome;
    private String telefone;
    private String telefoneLimpo;

    public Contato(String nome, String telefone){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Digite o nome do contato.");
        }
        telefoneLimpo = telefone.replaceAll("\\D", "");
        if (telefoneLimpo.length() != 11){
            throw new IllegalArgumentException("Digite o número completo.");
        }

        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirContatos(){
        System.out.println(nome + " - " + telefone);
    }
}

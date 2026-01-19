package br.com.alura.PraticandoJAVA.POO.metodos;

public class Tarefas {
    private String descricao;
    private boolean concluida;

    public Tarefas(String descricao, boolean concluida){
        if(descricao == null || descricao.isBlank()){
            throw new IllegalArgumentException("Digite a descrição da sua tarefa");
        }

        this.descricao = descricao;
        this.concluida = concluida;
    }

    public void exibirTarefas(){
        if(concluida){
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }
}

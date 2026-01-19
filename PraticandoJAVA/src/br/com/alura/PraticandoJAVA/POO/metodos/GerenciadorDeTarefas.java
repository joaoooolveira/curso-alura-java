package br.com.alura.PraticandoJAVA.POO.metodos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private List<Tarefas> listaDeTarefas = new ArrayList<>();

    public void adicionarTarefas(Tarefas tarefa){
        if(tarefa == null){
            throw new IllegalArgumentException("Tarefa inválida.");
        }

        listaDeTarefas.add(tarefa);
    }

    public void listarTarefas(){
        for (Tarefas tarefa : listaDeTarefas){
            tarefa.exibirTarefas();
        }
    }
}

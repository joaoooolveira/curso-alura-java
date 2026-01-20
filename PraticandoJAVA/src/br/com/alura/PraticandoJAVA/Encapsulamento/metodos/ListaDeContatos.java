package br.com.alura.PraticandoJAVA.Encapsulamento.metodos;

import java.util.ArrayList;
import java.util.List;

public class ListaDeContatos {
    List<Contato> listaDeContatos = new ArrayList<>();

    public void adicionarContato(Contato contato){
        if(contato == null){
            throw new IllegalArgumentException("Não foi possível adicionar o contato.");
        }

        listaDeContatos.add(contato);
    }

    public void listarContatos(){
        for (Contato contatos : listaDeContatos){
            contatos.exibirContatos();
        }
    }
}

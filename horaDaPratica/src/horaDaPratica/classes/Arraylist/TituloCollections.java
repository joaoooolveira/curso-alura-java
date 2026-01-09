package horaDaPratica.classes.Arraylist;

import java.util.Comparator;

public class TituloCollections implements Comparable<TituloCollections>{
    private String nome;

    public TituloCollections(String nome){
        this.nome = nome;
    }

    public int compareTo(TituloCollections titulo){
        return this.getNome().compareTo(titulo.getNome());
    }

    @Override
    public String toString() {
        return "Livro: " + this.getNome();
    }

    public String getNome() {
        return nome;
    }
}

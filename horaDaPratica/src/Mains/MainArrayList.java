package Mains;

import horaDaPratica.classes.Arraylist.PessoaArray;

import java.util.ArrayList;

public class MainArrayList {
    static void main() {
        PessoaArray pessoa1 = new PessoaArray("João", 18);
        PessoaArray pessoa2 = new PessoaArray("Leonardo", 23);
        PessoaArray pessoa3 = new PessoaArray("Pedro", 13);

        ArrayList<PessoaArray> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Pessoas: " + listaDePessoas.size());
        for (PessoaArray listaDePessoa : listaDePessoas) {
            System.out.println(listaDePessoa);
        }
    }

}

package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Biblioteca;

import java.time.LocalDate;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoDePublicacao, int edicao) {
        super(titulo, anoDePublicacao);
        validarConstrutor(edicao);

        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Revista: '" + getTitulo() + "' - Edição: " + edicao);
    }

    private void validarConstrutor(int edicao){
        if(edicao <= 0 || edicao > 1000){
            throw new IllegalArgumentException("Digite uma edição válida.");
        }
    }
}

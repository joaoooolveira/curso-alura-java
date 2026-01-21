package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Biblioteca;

import java.time.LocalDate;

public abstract class Midia {
    private String titulo;
    private int anoDePublicacao;

    public Midia(String titulo, int anoDePublicacao){
        validarConstrutor(titulo, anoDePublicacao);

        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void exibirInfo(){
        String palavra = getTitulo();
        String primeirasTres = palavra.substring(0,3);

        System.out.print("Código: LIB-" + primeirasTres + getAnoDePublicacao() + " | ");
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void validarConstrutor(String titulo, int anoDePublicacao){
        if(titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("Digite o título.");
        }
        if(anoDePublicacao < 1900 || anoDePublicacao > LocalDate.now().getYear()){
            throw new IllegalArgumentException("Digite um ano válido.");
        }
    }
}

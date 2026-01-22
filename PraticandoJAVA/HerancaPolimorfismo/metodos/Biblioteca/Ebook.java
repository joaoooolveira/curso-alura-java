package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Biblioteca;

import java.time.LocalDate;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        validarConstrutor(formato);

        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Ebook: '" + getTitulo() + "' - Formato: " + formato);
    }

    private void validarConstrutor(String formato){
        if(formato == null || formato.isBlank()) {
            throw new IllegalArgumentException("Digite o formato do eBook.");
        }
    }
}

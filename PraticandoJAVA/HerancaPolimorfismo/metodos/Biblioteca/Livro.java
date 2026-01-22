package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Biblioteca;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoDePublicacao, String autor) {
        super(titulo, anoDePublicacao);
        validarConstrutor(autor);

        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Livro: '" + getTitulo() + "' - Autor: " + autor);
    }

    private void validarConstrutor(String autor){
        if(autor == null || autor.isBlank()){
            throw new IllegalArgumentException("Digite o nome do autor desse livro.");
        }
    }
}

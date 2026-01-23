package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Relatorio;

public class Relatorio implements Imprimivel{
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo){
        validarDados(titulo, conteudo);

        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("""
                Título: %s
                Conteúdo: %s""".formatted(titulo, conteudo));
    }

    private void validarDados(String titulo, String conteudo){
        if(titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("Escreva o título do relatório.");
        }
        if(conteudo == null || conteudo.isBlank()){
            throw new IllegalArgumentException("Escreva o conteúdo de " + titulo);
        }
    }
}

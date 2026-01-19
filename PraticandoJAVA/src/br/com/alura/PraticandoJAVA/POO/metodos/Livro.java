package br.com.alura.PraticandoJAVA.POO.metodos;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas){
        if(titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("Insira um título ao livro.");
        }
        if(titulo == null || autor.isBlank()){
            throw new IllegalArgumentException("Insira o nome do autor.");
        }
        if(paginas <= 0){
            throw new IllegalArgumentException("O número de páginas deve ser maior que 0.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String toString(){
        return "'%s' de %s com %d páginas\n".formatted(titulo, autor, paginas);
    }
}

package br.com.alura.reprodutorMusical.metodos;

public class Musica extends Audio{
    private String album;
    private String autorMusica;
    private String generoMusical;

    public void fichaTecnicaMusica(){
        String fichaTecnicaMusica = """
                Título: %s
                Autor: %s
                Álbum: %s
                Gênero musical: %s""".formatted(getTitulo(), getAutor(), getAlbum(), getGeneroMusical());

        System.out.println(fichaTecnicaMusica);
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAutor() {
        return autorMusica;
    }

    public void setAutor(String autor) {
        this.autorMusica = autor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
}

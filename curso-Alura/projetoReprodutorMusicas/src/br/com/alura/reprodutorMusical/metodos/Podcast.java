package br.com.alura.reprodutorMusical.metodos;

public class Podcast extends Audio{
    private String apresentadorPodcast;
    private String descricao;

    public void fichaTecnicaPodcast(){
        String fichaTecnicaPodcast = """
                Título: %s
                Apresentador: %s
                Descrição: %s""".formatted(getTitulo(), getApresentadorPodcast(), getDescricao());

        System.out.println(fichaTecnicaPodcast);
    }

    public String getApresentadorPodcast() {
        return apresentadorPodcast;
    }

    public void setApresentadorPodcast(String apresentadorPodcast) {
        this.apresentadorPodcast = apresentadorPodcast;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

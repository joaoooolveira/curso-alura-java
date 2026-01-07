import br.com.alura.reprodutorMusical.metodos.Audio;
import br.com.alura.reprodutorMusical.metodos.Musica;
import br.com.alura.reprodutorMusical.metodos.Podcast;

public class Principal {
    static void main() {
        Audio meuAudio= new Audio();
        Musica FaroesteCaboclo = new Musica();

        FaroesteCaboclo.setTitulo("Faroeste Caboclo");
        FaroesteCaboclo.setAutor("Legião Urbana");
        FaroesteCaboclo.setAlbum("Que País é Este?");
        FaroesteCaboclo.setGeneroMusical("Rock");

        for (int i = 0; i < 1000; i++) {
            FaroesteCaboclo.Reproduzir();
        }

        for (int i = 0; i < 115; i++) {
            FaroesteCaboclo.Curtir();
        }

        FaroesteCaboclo.fichaTecnicaMusica();
//        System.out.println("Reproduções: " + FaroesteCaboclo.getTotalDeReproducoes());
//        System.out.println("Curtidas: " + FaroesteCaboclo.getCurtidas());
//        System.out.println("Classificação: " + FaroesteCaboclo.getClassificacao());
        meuAudio.audioAvaliado(FaroesteCaboclo);

        System.out.println();

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentadorPodcast("Marcus Mendes");

        for (int i = 0; i < 100; i++) {
            meuPodcast.Reproduzir();
        }

        for (int i = 0; i < 45; i++) {
            meuPodcast.Curtir();
        }

        meuPodcast.fichaTecnicaPodcast();
        meuPodcast.audioAvaliado(meuPodcast);
    }
}

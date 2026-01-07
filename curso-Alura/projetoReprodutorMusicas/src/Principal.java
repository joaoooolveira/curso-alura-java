import br.com.alura.reprodutorMusical.metodos.Audio;
import br.com.alura.reprodutorMusical.metodos.FavoritasDoPublico;
import br.com.alura.reprodutorMusical.metodos.Musica;
import br.com.alura.reprodutorMusical.metodos.Podcast;

public class Principal {
    static void main() {
        Audio meuAudio = new Audio();
        FavoritasDoPublico favoritas = new FavoritasDoPublico();
        Musica FaroesteCaboclo = new Musica();

        FaroesteCaboclo.setTitulo("Faroeste Caboclo");
        FaroesteCaboclo.setAutor("Legião Urbana");
        FaroesteCaboclo.setAlbum("Que País é Este?");
        FaroesteCaboclo.setGeneroMusical("Rock");

        for (int i = 0; i < 1000; i++) {
            FaroesteCaboclo.Reproduzir();
        }

        for (int i = 0; i < 570; i++) {
            FaroesteCaboclo.Curtir();
        }

        FaroesteCaboclo.fichaTecnicaMusica();
//        System.out.println("Reproduções: " + FaroesteCaboclo.getTotalDeReproducoes());
//        System.out.println("Curtidas: " + FaroesteCaboclo.getCurtidas());
//        System.out.println("Classificação: " + FaroesteCaboclo.getClassificacao());
        meuAudio.audioAvaliado(FaroesteCaboclo);
        favoritas.incluirFavoritas(FaroesteCaboclo);


        System.out.println();

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentadorPodcast("Marcus Mendes");

        for (int i = 0; i < 300; i++) {
            meuPodcast.Reproduzir();
        }

        for (int i = 0; i < 230; i++) {
            meuPodcast.Curtir();
        }

        meuPodcast.fichaTecnicaPodcast();
        meuPodcast.audioAvaliado(meuPodcast);
        favoritas.incluirFavoritas(meuPodcast);
    }
}

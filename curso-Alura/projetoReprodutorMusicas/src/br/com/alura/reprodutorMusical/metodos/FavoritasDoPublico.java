package br.com.alura.reprodutorMusical.metodos;

public class FavoritasDoPublico {

    public void incluirFavoritas(Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println("Essa música é a favorita do público atualmente!");
        } else if (audio.getClassificacao() >= 5){
            System.out.println("Essa música está em alta!");
        } else {
            System.out.println("Adicione essa música aos seus favoritos!");
        }
    }

}

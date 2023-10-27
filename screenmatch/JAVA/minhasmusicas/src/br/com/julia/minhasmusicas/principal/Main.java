package br.com.julia.minhasmusicas.principal;

import br.com.julia.minhasmusicas.modelos.Favoritos;
import br.com.julia.minhasmusicas.modelos.Musica;
import br.com.julia.minhasmusicas.modelos.PodCast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setNome("Stuck on you");
        minhaMusica.setArtista("Givion");
        minhaMusica.setAlbum("When It's All Said And Done... Take Time");
        minhaMusica.setGenero("R&B/Soul");

        for (int i = 0; i < 39; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 501; i++) {
            minhaMusica.curte();
        }

        
        PodCast podCast = new PodCast();
        podCast.setApresentador("Igão e Mítico.");
        podCast.setNome("PodPah");
        podCast.setNomeDoep("As piores Histórias de Date");
        podCast.setNumero(628);

        for (int i = 0; i < 475; i++) {
            podCast.reproduz();
        }
        for (int i = 0; i < 18; i++) {
            podCast.curte();
        }

        Favoritos favorito = new Favoritos();
        favorito.inclui(podCast);
        favorito.inclui(minhaMusica);
    }
}
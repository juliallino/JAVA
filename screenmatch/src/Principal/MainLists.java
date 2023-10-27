package Principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainLists {
    public static void main(String[] args) {
        Filme poderosoChefao = new Filme("Francis Ford Coppola", "O poderoso chefão", 1970,true);
        poderosoChefao.avalia(8);
        Filme transformers = new Filme("Michael Bay","Transformers o último cavaleiro",2017,true);
        transformers.avalia(9);
        Filme johnWick = new Filme("Summit Entertainment","John wick de volta ao jogo",2014, true );
        johnWick.avalia(10);

        Serie lost = new Serie(6, 10, true,30,"Lost",2004,true);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(transformers);
        list.add(poderosoChefao);
        list.add(johnWick);
        list.add(lost);
        for (Titulo item: list) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme) {
                System.out.println("Classificação: " + ((Filme) item).getClassificacao());
            }
        }
        System.out.println();


        Collections.sort(list);
        System.out.println("Títulos ordenados por nome: ");
        System.out.println(list);
        System.out.println();


        list.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Títulos ordenados por ano de lançamento: ");
        System.out.println(list);


        System.out.println();

        ArrayList<String> artista = new ArrayList<String>();
        artista.add("Mark Wahlberg");
        artista.add("Keanu Reeves");
        artista.add("Al Pacino");
        // System.out.println(artista);

        //colocar em ordem alfabetica
        Collections.sort(artista);
        System.out.println("Principais atores: ");
        System.out.println(artista);

    }
}

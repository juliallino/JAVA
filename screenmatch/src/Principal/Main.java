package Principal;

import br.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //Filme 1
        Filme poderosoChefao = new Filme("Francis Ford Coppola", "O poderoso chefão", 1970,true);
        poderosoChefao.avalia( 8.9 );
        poderosoChefao.avalia(9);
        poderosoChefao.avalia(7);
        poderosoChefao.setDuracaoEmMinutos(180);
        poderosoChefao.exibeFichaTecnica();

        System.out.println();

        //Filme 2
        Filme transformers = new Filme("Michael Bay","Transformers o último cavaleiro",2017,true);
        transformers.avalia( 8.9 );
        transformers.avalia(10);
        transformers.avalia(9);
        transformers.setDuracaoEmMinutos(154);
        transformers.exibeFichaTecnica();

        System.out.println();

        //Filme 3
        Filme johnWick = new Filme("Summit Entertainment","John wick de volta ao jogo",2014, true );
        johnWick.avalia(10);
        johnWick.avalia(9.5);
        johnWick.avalia(8);
        johnWick.setDuracaoEmMinutos(101);
        johnWick.exibeFichaTecnica();

        System.out.println();

        //Serie 1
        Serie lost = new Serie(6, 10, true,30,"Lost",2004,true);
        lost.avalia(9);
        lost.avalia(7.5);
        lost.avalia(8);
        lost.exibeFichaTecnica();

        System.out.println();


        //Calcular a quantidade total de minutos que você quer assistir
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(poderosoChefao);
        calculadora.inclui(transformers);
        calculadora.inclui(lost);
        System.out.println("Tempo total de Filmes/Series desejadas: " + calculadora.getTempoTotal());

        System.out.println();

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.print("Avaliação de O poderoso chefão: " );
        filtro.filtra(poderosoChefao);
        System.out.print("Avaliação de Transformers: " );
        filtro.filtra(transformers);
        System.out.print("Avaliação de Lost: " );
        filtro.filtra(lost);

        System.out.println();

        //episódio
        Episodio episodio = new Episodio();
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setTemporada(1);
        episodio.setTotalDeVizualizacao(40000);
        episodio.setSerie("The Last of us");
        episodio.mostrarElementos();
        System.out.print("Avaliações: " );
        filtro.filtra(episodio);

        System.out.println();

        //Lista dos filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(transformers);
        listaDeFilmes.add(poderosoChefao);
        listaDeFilmes.add(johnWick);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size() + " filmes.");
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Segundo filme: " + listaDeFilmes.get(1).getNome());
        System.out.println("Terceiro filme: " + listaDeFilmes.get(2).getNome());
        System.out.println(listaDeFilmes.toString());


    }
}



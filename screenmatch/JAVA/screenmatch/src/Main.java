import br.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        //Poderoso Chefão
        Filme poderosoChefao = new Filme();
        poderosoChefao.setNome("O poderoso chefão");
        poderosoChefao.setAnoDeLancamento(1970);
        poderosoChefao.avalia( 8.9 );
        poderosoChefao.avalia(9);
        poderosoChefao.avalia(7);
        poderosoChefao.exibeFichaTecnica();
        poderosoChefao.setDuracaoEmMinutos(180);
        poderosoChefao.setDiretor("Francis Ford Coppola");
        poderosoChefao.completeFilme();

        System.out.println("");

        //Transformers
        Filme transformers = new Filme();
        transformers.setNome("Transformers o último cavaleiro");
        transformers.setAnoDeLancamento(2017);
        transformers.avalia( 8.9 );
        transformers.avalia(10);
        transformers.avalia(9);
        transformers.setIncluidoNoPlano(true);
        transformers.exibeFichaTecnica();
        transformers.setDuracaoEmMinutos(154);
        transformers.setDiretor("Michael Bay");
        transformers.completeFilme();

        System.out.println("");

        //Lost
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.avalia(9);
        lost.avalia(7.5);
        lost.avalia(8);
        lost.setIncluidoNoPlano(true);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpsPorTemp(10);
        lost.setAtiva(true);
        lost.setMinPorEp(30);
        lost.completeSerie();

        System.out.println("");


        //Calcular a quantidade total de minutos que você quer assistir
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(poderosoChefao);
        calculadora.inclui(transformers);
        calculadora.inclui(lost);
        System.out.println("Tempo total de Filmes/Series desejadas: " + calculadora.getTempoTotal());

        System.out.println("");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.print("Avaliação de O poderoso chefão: " );
        filtro.filtra(poderosoChefao);
        System.out.print("Avaliação de Transformers: " );
        filtro.filtra(transformers);
        System.out.print("Avaliação de Lost: " );
        filtro.filtra(lost);

        System.out.println("");

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
    }
}



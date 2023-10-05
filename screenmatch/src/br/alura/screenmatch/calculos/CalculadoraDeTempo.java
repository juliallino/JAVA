package br.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        System.out.println("Adicionando duração total em minutos de " + t);
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}

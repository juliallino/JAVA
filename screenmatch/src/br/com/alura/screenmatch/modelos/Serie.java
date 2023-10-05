package br.com.alura.screenmatch.modelos;

import br.alura.screenmatch.calculos.Classificavel;

//Classe filha
public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int epsPorTemp;
    private boolean ativa;
    private float minPorEp;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsPorTemp() {
        return epsPorTemp;
    }

    public void setEpsPorTemp(int epsPorTemo) {
        this.epsPorTemp = epsPorTemo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public float getMinPorEp() {
        return minPorEp;
    }

    public void setMinPorEp(float minPorEp) {
        this.minPorEp = minPorEp;
    }

    public void completeSerie(){
        System.out.println("Quantidade de temporadas: " + temporadas);
        System.out.println("Media de minutos por episódio: " + minPorEp);
        System.out.println("Episódio por temporada: " + epsPorTemp);
        System.out.println("Ativa: " + ativa);
        System.out.println("Duração total em minutos: " + getDuracaoEmMinutos());
    }

    @Override
    public int getDuracaoEmMinutos() {
        return (int) (temporadas * epsPorTemp * minPorEp);
    }
    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2) ;
    }

}

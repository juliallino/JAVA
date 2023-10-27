package br.com.alura.screenmatch.modelos;

import br.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private int temporada;
    private String nome;
    private String serie;
    private int totalDeVizualizacao;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getTotalDeVizualizacao() {
        return totalDeVizualizacao;
    }

    public void setTotalDeVizualizacao(int totalDeVizualizacao) {
        this.totalDeVizualizacao = totalDeVizualizacao;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVizualizacao > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    public void mostrarElementos(){
        System.out.println("Nome da Série: " + getSerie());
        System.out.println("Nome do episódio: " + getNome());
        System.out.println("Número do episódio: " + getNumero());
        System.out.println("Número da temporada: " + getTemporada());


    }
}

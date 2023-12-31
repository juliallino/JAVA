package br.com.alura.screenmatch.modelos;

import br.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String diretor, String nome, int anoDeLancamento, boolean incluidoNoPlano) {
        super(nome, anoDeLancamento, incluidoNoPlano);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Nome do Diretor: " + getDiretor());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2) ;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}



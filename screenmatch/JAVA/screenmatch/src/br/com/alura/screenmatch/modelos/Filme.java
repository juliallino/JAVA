package br.com.alura.screenmatch.modelos;

import br.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    public void completeFilme(){
        System.out.println("Nome do Diretor: " + getDiretor());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2) ;
    }

}



package br.com.julia.minhasmusicas.modelos;

import br.com.julia.minhasmusicas.modelos.Audio;

public class PodCast extends Audio {
    private String apresentador;
    private int numero;
    private String nomeDoep;

    public String getNomeDoep() {
        return nomeDoep;
    }

    public void setNomeDoep(String nomeDoep) {
        this.nomeDoep = nomeDoep;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Polimorfismo
    @Override
    public int getClassificacao() {
      if (this.getTotalDeCurtidas()>10){
          return 10;
        } else{
          return 8;
      }
    }
}

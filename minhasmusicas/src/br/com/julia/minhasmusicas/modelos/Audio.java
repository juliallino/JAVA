package br.com.julia.minhasmusicas.modelos;
public class Audio {
    private String nome;
    private float duracao;
    private int totalDeCurtidas;
    private int totalDeReproducoes;
    private int classificacao;

     public void curte(){
         this.totalDeCurtidas++;
     }

     public void reproduz(){
         this.totalDeReproducoes++;
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDuracao() {
        return duracao;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }
}

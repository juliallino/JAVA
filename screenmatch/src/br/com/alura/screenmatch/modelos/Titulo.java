package br.com.alura.screenmatch.modelos;

    public abstract class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano){
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
        this.setIncluidoNoPlano(incluidoNoPlano);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme/Série: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + pegaMedia());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento() );
        System.out.println("Incluido no plano: " + isIncluidoNoPlano());
    }

        @Override
        public int compareTo(Titulo outroTitulo) {
            return this.getNome().compareTo(outroTitulo.getNome());
        }
    }

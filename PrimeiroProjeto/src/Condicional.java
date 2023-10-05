public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento;
        anoDeLancamento = 2017;
        boolean incluidoNoPlano;
        incluidoNoPlano = true;
        double notaPop;
        notaPop = 43.1;
        String tipoPlano = "plus";

        if (incluidoNoPlano || tipoPlano.equals("plus")) System.out.println("Filme liberado!");
        else System.out.println("Filme não liberado, precisa pagar a locação.");

    }
}

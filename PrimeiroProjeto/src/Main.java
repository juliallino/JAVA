import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Transformers The Last Knight");

    //LANÇAMENTO:
        int anoDeLancamento;
        anoDeLancamento = 2017;
        System.out.println("Lançado em " + anoDeLancamento +";");

    //PLANO
        System.out.println("Você tem NETFLIX, STARPLUS, AMAZON PRIME OU PARAMOUNT? DIGITE S OU N");
        String incluidoNoPlano;
        incluidoNoPlano = prompt.nextLine();
        if (incluidoNoPlano.equals("S")){
            System.out.println("ESTÁ INCLUÍDO NO SEU PLANO!!");
         } else {
            System.out.println("NÃO INCLUÍDO NO PLANO!!");
        }

    //NOTA DO FILME
        int notaDoRotten;
        notaDoRotten = 16;
        double notaPop;
        notaPop = 43.1;
        String nota = """
                Nota no Rotten Tomato é %d.
                Nota da audiência foi %2f.
                """.formatted(notaDoRotten, notaPop);
        System.out.println(nota);

    // ESTRELAS DO FILME
      double media = (notaDoRotten + notaPop) /8;
      int classificacao;
      classificacao = (int) media/2;
        System.out.println("O NÚMERO DE ESRELAS DO FILME É: " + classificacao);
    }
}
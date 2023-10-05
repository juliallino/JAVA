import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Dogite o Filme escolhido: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int ano = leitura.nextInt();;
        System.out.println("Qual sua Nota para o filme? 0-10");
        double nota = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(nota);
    }
}

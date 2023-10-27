import java.util.Scanner;

public class LoopF {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua nota para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println(String.format("A média para esse filme foi: %f ", mediaAvaliacao/3));

    }
}

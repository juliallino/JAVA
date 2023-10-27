import java.util.Scanner;

public class LoopW {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua nota para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
                if (nota!= -1){
                    mediaAvaliacao += nota;
                     totalDeNotas++;}

        }
        if (totalDeNotas != 0) {
            System.out.println(String.format("A média para esse filme foi: %f ", mediaAvaliacao / totalDeNotas));
        } else {
            System.out.println("Ainda não possui notas!");
        }

    }
}

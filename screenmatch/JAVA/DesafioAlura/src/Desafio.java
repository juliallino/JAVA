import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Nome do Cliente
        System.out.println("Digite o Seu Nome Completo: ");
        String nome = scan.nextLine();

        //Tipo da conta
        System.out.println("Digite o tipo da conta: (Corrente || Conjunta || Poupança || Salário");
        String tipoConta = scan.nextLine();

        //Saldo inicial (Generalizado)
         float saldoInicial = 3000;

        //Informações recebidas

        System.out.println("*** Dados iniciais do cliente ***");
        System.out.println("                                  ");
        System.out.println(String.format("Nome: %s ", nome));
        System.out.println(String.format("Tipo de conta: %s;", tipoConta));
        System.out.println(String.format("Saldo Atual: R$%.2f;", saldoInicial));
        System.out.println("                                  ");
        System.out.println("*********************************");


        //Operações

        System.out.println("MENU");
        System.out.println("                      ");
        System.out.println("1- Consultar Saldos");
        System.out.println("2- Receber Valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println("                      ");
        System.out.println("Digite a operação desejada: ");
        int operacao = scan.nextInt();

        //Condições
            while(operacao!= 4 ) {
            if(operacao == 1){
                System.out.println(String.format("Seu saldo é de: R$%.2f.", saldoInicial));
                break;
            } else if (operacao == 2) {
                System.out.println("Digite o valor à depositar: ");
                float deposito = scan.nextFloat();
                System.out.println("Seu saldo atual é: " + (saldoInicial + deposito));
                break;
            } else if (operacao == 3){
                System.out.println("Digite o valor à transferir: ");
                float transfe = scan.nextFloat();
                System.out.println("Seu saldo atual é: " + (saldoInicial - transfe));
                break;
            } else {
                System.out.println("Não existe essa operação, digite novamente");
                break;
                 }
            }


    }
}



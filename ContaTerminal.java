import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os calores digitados

        //Exibir a mensagem conta criada

        int num;
        int agencia;
        String nomeCliente;
        double saldo  =  237.48;

        System.out.println("Qual Número da sua conta: ");
        num = ler.nextInt();

        System.out.println("Digite o numero da sua Agência: ");
        agencia = ler.nextInt();

        System.out.println("Digite o nome do Cliente: ");
        nomeCliente = ler.next();


        System.out.println("Seu saldo é: R$ 237.48");




        System.out.println("Olá " + nomeCliente + " seja bem-vindo ao nosso banco, sua agência é: " + agencia +" e seu número da conta é: " + num + " no momento você se encontra com R$" + saldo + " que já está disponivel para saque!");
    }
}

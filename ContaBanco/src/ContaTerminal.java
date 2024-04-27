import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern(" R$ #,##0.00 ");

        Scanner scanner = new Scanner(System.in);

        System.err.println("Entre com o Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.err.println("Entre com o numero da sua Agencia: ");
        int agencia = scanner.nextInt();

        scanner.nextLine();

        System.err.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.err.println("Digite o valor: ");
        Double quantidade = scanner.nextDouble();

        scanner.close();

        System.err.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + df.format(quantidade) + " já está disponível para saque. ");

    }

}

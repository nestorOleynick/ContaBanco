import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;
        
        System.out.println("Por favor, digite o numero da conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite a agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está dísponível para saque.");

    }
}

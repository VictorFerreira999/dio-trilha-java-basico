import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, vamos à criação da sua conta.");
        System.out.println("Nos informe o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Nos informe o número da sua conta:");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Nos informe o seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Nos informe o valor que deseja depositar:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();


    }
}

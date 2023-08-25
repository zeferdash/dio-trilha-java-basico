import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        System.out.println("Por favor, entre com o numero da conta e agencia:");
        int numero = sc.nextInt();
        String agencia = sc.next();

        System.out.println("Olá " + nomeCliente +",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " +  saldo + " já está disponível para saque.");
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao terminal bank! Insira o número da sua agencia formado por 4 digitos:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora insira a agência no formato 000-0:");
        String agencia = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Insira seu nome por favor:");
        String nome = scanner.nextLine();

        System.out.println("Por fim insira seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",  conta " + numeroConta +  " e seu saldo "+ saldo + " já está disponível para saque" );

    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaAppCliente {

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Digite o numero da conta ");
        conta.numeroConta = scanner.nextInt();

        System.out.println("Digite qual agencia  ");
        conta.agencia = scanner.next();

        System.out.println("Digite o nome do cliente ");
        conta.nomeCliente = scanner.next();

        System.out.println("Digite o sobrenome ");
        conta.sobreNome = scanner.next();

        System.out.println("Digite o saldo ");
        conta.saldo = scanner.nextDouble();

        scanner.close();

        System.out.println(" Ola " + conta.nomeCliente  + " " + conta.sobreNome + " obrigado por criar uma conta em nosso banco"
        + " sua agencia "+" "+ conta.agencia + " conta " + conta.numeroConta + " saldo " + conta.saldo + " " + "ja esta disponivel!");
    }
}

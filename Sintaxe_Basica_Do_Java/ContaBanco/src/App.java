
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String numeroAgenciaBanco = "";
        int numeroContaBanco = 0;
        String nomeClienteBanco = "";
        double saldoContaClienteBanco = 0.0;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            
            
            System.out.println("Informe a agencia do banco no formato: 0000 ");
            numeroContaBanco = scanner.nextInt();

            System.out.println("Informe agora o número");
            numeroAgenciaBanco = scanner.next();

            System.out.println("Informe o nome do cliente: ");
            nomeClienteBanco = scanner.next();

            System.out.println("Informe o saldo: ");
            saldoContaClienteBanco = scanner.nextDouble();

        }catch (Exception err)
        {
            System.err.println("Valor: " + err.getMessage());
        }

        ContaTerminal ct1 = new ContaTerminal();

        ct1.pegarNumeroAgencia(numeroAgenciaBanco);
        ct1.pegarNumeroConta(numeroContaBanco);
        ct1.pegarNomeCliente(nomeClienteBanco);
        ct1.atualizarValorDoSaldo(saldoContaClienteBanco);

        // System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s", ct1.nomeCliente, ct1.agencia);
        // System.out.printf(", conta %d e seu saldo é de %f já está disponivel para saque.", ct1.numeroConta, ct1.saldoCliente);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo é de %f já está disponivel para saque.", ct1.nomeCliente, ct1.agencia, ct1.numeroConta, ct1.saldoCliente);

    }
}

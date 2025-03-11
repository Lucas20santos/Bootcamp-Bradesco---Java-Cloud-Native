import banco.ContaBancaria;
public class Usuarios
{
    public static void main(String[] args) 
    {
        while (true) 
        {
            System.out.println("Você deseja criar uma conta bancária? (s/n)");
            String resposta = System.console().readLine();
            if (resposta.equals("n"))
            {
                break;
            }
            System.out.println("Antes informe o valor do deposito para iniciarmos sua conta: ");
            double valorDeposito = Double.parseDouble(System.console().readLine());

            ContaBancaria conta = new ContaBancaria(valorDeposito);
            System.out.println("Conta bancária criada com sucesso!");
            System.out.println("Número da conta bancária: " + conta.getNumeroContaBancaria());

            while (true)
            {
                System.out.println("Digite a opção desejada:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Pagar boleto");
                System.out.println("4 - Usar cheque especial");
                System.out.println("5 - Ver saldo");
                System.out.println("6 - Encerrar conta bancária");

                int opcao = Integer.parseInt(System.console().readLine());
                if (opcao < 1 || opcao > 6)
                {
                    System.out.println("Opção inválida!");
                    continue;
                }
                else if (opcao == 6)
                {
                    System.out.println("Conta bancária encerrada com sucesso!");
                    break;
                }
                conta.menu(opcao);
            }
        }
    }
}

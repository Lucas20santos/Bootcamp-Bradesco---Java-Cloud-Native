public class CaixaEletronica_EstruturaControleSimples {
    public static void main(String[] args)
    {
        System.out.println("Controle de fluxo - Estrutura condicional simples");

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
        {
            saldo = saldo - valorSolicitado;
        }
        System.out.printf("Novo saldo: %f\n", saldo);
        
    }
}

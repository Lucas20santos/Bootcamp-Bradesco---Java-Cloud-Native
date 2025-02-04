public class Conta {
    // variável da classe conta
    double saldo = 10.0;

    public double sacar(double valor)
    {
        // variavel local de método
        double novoSaldo = this.saldo - valor;
        return novoSaldo;
    }
    public void imprimirSaldo()
    {
        // disponível em toda classe
        System.out.println(this.saldo);
        // somente o métod sacar conhece esta variavel

    }
    public double calcularDividaExponencial()
    {
        // variaveis com escopo de metodo
        double valorParcela = 50.0;
        double valorMontante = 0.0;

        // a variável x tem escopo de fluxo
        for(int x = 1; x < 6; x++)
        {
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        return valorMontante;
    }
}

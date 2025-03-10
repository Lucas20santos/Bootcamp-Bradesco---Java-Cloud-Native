package banco;

public class ContaBancaria 
{   
    private static int contador = 1;

    private double saldo = 0;
    private double depositar = 0;
    private boolean usandoChequeEspecial = false;
    private double pagarBoleto = 0;
    private double valorBoleto = 0;
    private double chequeEspecial = 0;
    private int numeroContaBancaria = 0;
    private boolean contaAtiva = false;

    public ContaBancaria()
    {
        this.numeroContaBancaria = contador++;
        this.contaAtiva = true;
    }

    private double getDepositar()
    {
        return this.depositar;
    }

    private void setDepositar(double depositar)
    {
        this.saldo +=  depositar;
    }

    private double getSaldo()
    {
        return this.saldo;
    }

    private void setSaldo(double valor)
    {
        this.saldo -= valor;
    }
    
    public int getNumeroContaBancaria()
    {
        return this.numeroContaBancaria;
    }

    public boolean isContaAtiva() 
    {
        return this.contaAtiva;
    }

    public boolean isUsandoChequeEspecial() 
    {
        return this.usandoChequeEspecial;
    }
    
    public double getPagarBoleto() 
    {
        return this.pagarBoleto;
    }
    
    public void setPagarBoleto(double pagarBoleto) 
    {
        this.pagarBoleto = pagarBoleto;
    }
    
    public double getValorBoleto() 
    {
        return this.valorBoleto;
    }

    public double getChequeEspecial() 
    {
        return this.chequeEspecial;
    }

    // Métodos para realizar operações bancárias...
    public String depositar(double valor)
    {   this.depositar = valor;
        
        if(valor >= 0)
        {
            this.setDepositar(valor);
            return "Depósito de R$" + this.getDepositar() + " realizado com sucesso!";
        }
        else
        {
            return "Valor inválido!";
        }
    }

    public String sacar(double valor)
    {
        if(this.getSaldo() >= valor)
        {
            this.setSaldo(valor);
            return "Saque de R$" + valor + " realizado com sucesso!";
        }
        else
        {
            return "Saldo insuficiente! Seu saldo é de R$" + this.getSaldo();
        }
    }

    public String pagarBoleto(double valor)
    {
        return "Pagamento de boleto de R$" + valor + " realizado com sucesso!";
    }

    public String usarChequeEspecial(double valor)
    {
        return "Cheque especial de R$" + valor + " utilizado com sucesso!";
    }

    public void menu(int opcao)
    {
        if(opcao == 1)
        {
            System.out.println("Digite o valor do depósito:");
            double valor = Double.parseDouble(System.console().readLine());
            System.out.println(this.depositar(valor));
        }
        else if(opcao == 2)
        {
            System.out.println("Digite o valor do saque:");
            double valor = Double.parseDouble(System.console().readLine());
            System.out.println(sacar(valor));
        }
        else if(opcao == 3)
        {
            System.out.println("Digite o valor do boleto:");
            valorBoleto = Double.parseDouble(System.console().readLine());
            System.out.println(pagarBoleto(valorBoleto));
        }
        else if(opcao == 4)
        {
            System.out.println("Digite o valor do cheque especial:");
            chequeEspecial = Double.parseDouble(System.console().readLine());
            System.out.println(usarChequeEspecial(chequeEspecial));
        }
        else if(opcao == 5)
        {
            System.out.println("Saldo: R$" + getSaldo());
            System.out.println("Cheque especial: R$" + getChequeEspecial());
        }
        else if(opcao == 6)
        {
            System.out.println("Conta bancária encerrada com sucesso!");
            contaAtiva = false;
        }
    }
}
